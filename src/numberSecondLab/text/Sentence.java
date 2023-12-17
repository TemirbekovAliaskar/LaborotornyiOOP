package numberSecondLab.text;

import java.util.ArrayList;

public class Sentence extends Word {

    protected ArrayList<Word> words;

    public Sentence(String word) {
        super(word);
        this.words = new ArrayList<>();
    }
    public void addWord(Word word) {
        words.add(word);
    }

    public String getSentence() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : words) {
            sentence.append(word.getWord()).append(" ");
        }
        return sentence.toString().trim() + ".";
    }
}
