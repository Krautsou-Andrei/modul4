package by.part.text.main;

import java.util.List;

import by.part.text.bean.Sentence;
import by.part.text.bean.Text;
import by.part.text.bean.Word;

public final class Print {

	private Print() {

	}

	public static void printText(Text text) {

		for (Sentence sentence : text.getHeader()) {
			printHeader(sentence.getSentence());
		}

		for (Sentence sentence : text.getText()) {
			printSentence(sentence.getSentence());

		}

		System.out.println();
	}

	public static void printSentence(List<Word> sentence) {

		sentence.forEach(word -> System.out.print(" " + word));
		System.out.print(".");

	}

	public static void printHeader(List<Word> sentence) {

		System.out.printf("%30s", "");
		printSentence(sentence);
		System.out.println();
	}

}
