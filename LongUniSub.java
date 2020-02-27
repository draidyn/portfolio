import java.util.*;
public class LongUniSub {
    /*
    /*
    Longest Substring Without Repeating Characters
    Given a string, find the length of the longest substring without repeating characters.
    */

    /**
     * Main program that runs the sequences
     * @param args - the line given to it by the compiler
     */
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sequence of characters to find the unique substring");
        String line = input.nextLine();
        unique(line);
        input.close();
    }

    /**
     * method used to run the main core of the engine
     */
    public static String unique(String line) {
        if (line.isEmpty()) return null;
        String word = ""; //holds the word to be returned
        int r1 = 0; //reader 1 used as a pointer to the beginning of the string
        HashSet<Character> container = new HashSet<>();
        int longest = 0; //initial length of the longest unique sequence

        for (int r2 = 0; r2 < line.length(); r2++) { //going to sequentially move the pointer looking for duplicates in the HashSet
            if (!container.contains(line.charAt(r2))) { // the hashset doesnt contain a duplicate of the char being looked at
                container.add(line.charAt(r2)); //so add the character to the HashSet
            }
            else { //there is a duplicate
                r1 = r2; //set the pointer of r1 to r2
                if (line.substring(r1, r2).length() > longest) { //if the length of the new substring is longer than the 
                    word = line.substring(r1, r2);
                    longest = word.length();
                }
            }
        }
        return word;
    }
}