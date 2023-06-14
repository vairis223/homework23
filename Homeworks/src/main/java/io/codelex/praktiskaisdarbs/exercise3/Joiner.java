package io.codelex.praktiskaisdarbs.exercise3;

import java.util.StringJoiner;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... items) {
        StringJoiner joiner = new StringJoiner("-");
        for (T item : items) {
            joiner.add(item.toString());
        }
        return joiner.toString();
    }

}
