package org.example;

import java.util.ArrayList;

public class SearchForTheLongestWord {
    private int longestWord;
    private final ArrayList<String> longestWords;

    public SearchForTheLongestWord(){
        this.longestWord = 0;
        this.longestWords = new ArrayList<>();
    }

    public void searchForTheLongestWord(String word){
        if (word.length() > longestWord){
            longestWord = word.length();
            longestWords.clear();
            longestWords.add(word);
        } else if (word.length() == longestWord) {
            if (!longestWords.contains(word)){
                longestWords.add(word);
            }
        }
    }

    public ArrayList<String> getLongestWords(){
        return longestWords;
    }
}
