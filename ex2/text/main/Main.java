package by.part.text.main;

import by.part.text.bean.Sentence;
import by.part.text.bean.Text;
import by.part.text.bean.Word;
import by.part.text.logic.TextLogic;

public class Main {
	
	public static void main(String[] args) {

		String header = "English primary school";
		String stringOne = "In Great Britain school begins at the age of five";
		String stringTwo = "At the age of sixteen the children usually leave school";
		String stringThree = "So they spend eleven years there";

		Sentence sentenceHeader = TextLogic.sentence(header.toUpperCase());
		Sentence sentenceOne = TextLogic.sentence(stringOne);
		Sentence sentenceTwo = TextLogic.sentence(stringTwo);
		Sentence sentenceThree = TextLogic.sentence(stringThree); 
		
		Text text = new Text();
		text.addHeader(sentenceHeader);
		text.addText(sentenceOne);
		text.addText(sentenceTwo);
		text.addText(sentenceThree);
		

		Print.printText(text);
		
		text.getText().get(0).getSentence().add(new Word("Hello"));
		
		Print.printText(text);
		
	}

}
