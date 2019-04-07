package luxoft.task2;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T extends Set> T distinct(T t) {
        return t;
    }

    public static void main(String[] args) {
        HashSet set1 = distinct(new HashSet());
        ArrayDeque set2 = distinct(new ArrayDeque());
        Set set3 = distinct(new HashSet());
        Set set4 = distinct(new ArrayDeque());
        Set set5 = distinct(new Set());
    }
}
