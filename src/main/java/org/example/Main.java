package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            WordCount wordCount = new WordCount();
            SearchForTheLongestWord searchLongest = new SearchForTheLongestWord();
            WordFrequencyCount wordFrequencyCount = new WordFrequencyCount();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount.countWord(word);
                searchLongest.searchForTheLongestWord(word);
                wordFrequencyCount.addWord(word);
            }

            System.out.println("Общее количество слов: " + wordCount.getTotalNumberOfWords());
            System.out.println("Самое длинное слово: " + searchLongest.getLongestWords());
            System.out.println("Частота слов в файле: ");
            wordFrequencyCount.printWordFrequency();

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
