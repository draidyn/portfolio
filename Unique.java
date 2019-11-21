import java.util.*;

public class Unique {
    public static void main (String[] args) {
        String word = "abcdefga";
        System.out.println(isUnique(word));
    }

    static boolean isUnique (String word) {
        if (word.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < word.length(); i++) {
            int value = word.charAt(i);
            System.out.println(value);
            if (char_set[value]) return true;
            else char_set[value] = true;
        }

        return false;
    }
}