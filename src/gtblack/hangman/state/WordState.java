package gtblack.hangman.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordState {

    private String currentWord;
    private Set<Integer> openedPositions;

    public WordState() {
        openedPositions = new ArrayList<>();
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    public void addOpenedPositions(List<Integer> pos) {
        for (Integer i : pos) {
            openedPositions.add(i);
        }
    }

    public boolean gameEnded() {
        return currentWord.length() == openedPositions.size();
    }
}