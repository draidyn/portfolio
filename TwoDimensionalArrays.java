import java.util.*;

public class TwoDimensionalArrays {
    public static void main (String[] args) {
        ArrayList<Integer> result;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        result = join(arr);

    }

    static ArrayList<Integer> join(int[] arr) {
        if (arr.length <= 1) return null;
        ArrayList<Integer> values = new ArrayList<>();
 
        Stack<Integer> pile = new Stack();
        int num1 = arr[0], num2 = arr[1];

        pile.push(num1 * 10 + num2);
        values.add(num1 * 10 + num2);
        
        for (int i = )
        
    }
}

// if y is less than 10 multiply x with 10 and add x and y.... if y is greater than or equal to 10 then you should
// multiply x with 100 and add x and y, if y is three digit number multiply x with 1000 and add them and so on...