package by.part.text.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
//вывести на консоль текст, заголовок текста.

public class Text {
	private List<Sentence> header = new ArrayList<>();
	private List<Sentence> text = new ArrayList<>();

	public Text() {

	}

	public Text(List<Sentence> text, List<Sentence> header) {
		this.text = text;
		this.header = header;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public List<Sentence> getHeader() {
		return header;
	}

	public void setHeader(List<Sentence> header) {
		this.header = header;
	}

	public void addText(Sentence sentence) {
		this.text.add(sentence);
	}

	public void addHeader(Sentence sentence) {
		this.header.add(sentence);
	}

	@Override
	public int hashCode() {
		return Objects.hash(text, header);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Text other = (Text) obj;
		return Objects.equals(text, other.text) && Objects.equals(header, other.header);
	}

	@Override
	public String toString() {
		return "Text" + header + text;
	}

}
