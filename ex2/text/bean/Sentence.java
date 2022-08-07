package by.part.text.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

	private List<Word> sentence = new ArrayList<>();

	public Sentence() {

	}

	public Sentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public void addSentence(Word word) {
		this.sentence.add(word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentence);
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
		Sentence other = (Sentence) obj;
		return Objects.equals(sentence, other.sentence);
	}

	@Override
	public String toString() {
		return "sentence = " + sentence;
	}

}
