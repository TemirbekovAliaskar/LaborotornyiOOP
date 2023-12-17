package numberSecondLab.text;

public class Main2 {
    public static void main(String[] args) {
        Word word1 = new Word("Java");
        Word word2 = new Word("JS");
        Word word3 = new Word("DATA BASE");

        Sentence sentence1 = new Sentence("Java");
        sentence1.addWord(word1);
        sentence1.addWord(word2);
        sentence1.addWord(word3);
        Text text = new Text("Introduction to Java","Java");
        text.addSentence(sentence1);

        text.displayTitle();
        text.displayText();

        Sentence sentence2 = new Sentence("Java");
        Word word4 = new Word("Programming");
        Word word5 = new Word("is");
        Word word6 = new Word("perfect");
        sentence2.addWord(word4);
        sentence2.addWord(word5);
        sentence2.addWord(word6);
        text.addSentence(sentence2);

        text.displayText();
    }
}
