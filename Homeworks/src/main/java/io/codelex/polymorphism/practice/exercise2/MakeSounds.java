package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sounds = new ArrayList<>();

        Sound parrot1 = new Parrot("Kraa, Kraaa!");
        sounds.add(parrot1);

        Sound parrot2 = new Parrot(("Give me a cracker!"));
        sounds.add(parrot2);

        Sound radio1 = new Radio("This morning news...");
        sounds.add(radio1);

        Sound radio2 = new Radio("Latest news in this evening...");
        sounds.add(radio2);

        for (Sound sound : sounds) {
            String playSound = sound.playSound();
            System.out.println(playSound);

        }
    }
}
