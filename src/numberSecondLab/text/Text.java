package numberSecondLab.text;

import java.util.ArrayList;

public class Text extends Sentence {

    public String title;
    public ArrayList<Sentence> sentences;

    public Text(String word,String title) {
        super(word);
        this.title = title;
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }
    public String getText() {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence.getSentence()).append(" ");
        }
        return text.toString();
    }
    public void displayTitle() {
        System.out.println("Title: " + title);
    }

    public void displayText() {
        System.out.println("Text:");
        System.out.println(getText());
    }
}
