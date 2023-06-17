package io.codelex.praktiskaisdarbs.exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {
    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        int count = 0;
        for (T item : list) {
            if (condition.test(item)) {
                count++;
            }
        }
        return (double) count / list.size();
    }
}
