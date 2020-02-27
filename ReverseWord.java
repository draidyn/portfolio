import java.util.*;

public class ReverseWord {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        reverse(line);
        input.close();
    }

    static void reverse (String line) {
        int counter = line.length();
        for (int x = counter - 1; x > 1; x--) {
            if (line.charAt(x) == ' ') {
                System.out.print(line.substring(x, counter));
                counter = x;
            }
        }
        System.out.println(" " + line.substring(0, counter));
    }
}