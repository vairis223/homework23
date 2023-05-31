package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        Map<Integer, Integer> histogram = createHistogram(scores);
        displayHistogram(histogram);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readString(path, charset);

    }

    private static Map<Integer, Integer> createHistogram(String scores) {
        Map<Integer, Integer> histogram = new HashMap<>();
        String[] scoreArray = scores.split(" ");

        for (String score : scoreArray) {
            int value = Integer.parseInt(score);
            int tab = value / 10 * 10;
            histogram.put(tab, histogram.getOrDefault(tab,0) + 1);
        }
        return histogram;
    }

    private static void displayHistogram(Map<Integer, Integer> histogram) {
        System.out.println("Histogram:");

        for (int i = 0; i < 10; i++) {
            int lowerBound = i * 10;
            int upperBound = lowerBound + 9;

            if (i == 9) {
                upperBound = 100;
            }

            System.out.printf("%02d-%02d: ", lowerBound, upperBound);

            int size = histogram.getOrDefault(lowerBound, 0);

            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
