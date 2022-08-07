package by.part.text.logic;

import by.part.text.bean.Sentence;
import by.part.text.bean.Word;

public final class TextLogic {

	private TextLogic() {

	}

	public static Sentence sentence(String string) {

		Sentence sentence = new Sentence();

		for (String word : string.split(" ")) {
			sentence.addSentence(new Word(word));
		}

		return sentence;
	}

}
