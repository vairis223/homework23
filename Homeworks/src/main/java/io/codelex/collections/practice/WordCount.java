package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) {
        try {
            final Path path = Paths.get(WordCount.class.getResource(file).toURI());
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            for (String line : Files.readAllLines(path, charset)) {
                lineCount++;
                charCount += line.length();

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty() && containsLettersOrDigits(word)) {
                        wordCount++;
                    }
                }
            }

            System.out.println("Lines = " + lineCount);
            System.out.println("Words = " + wordCount);
            System.out.println("Chars = " + charCount);
        } catch (IOException | java.net.URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static boolean containsLettersOrDigits(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}