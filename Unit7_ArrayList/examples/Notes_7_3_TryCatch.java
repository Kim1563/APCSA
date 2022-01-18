package Unit7_ArrayList.examples;

import java.util.Scanner;

public class Notes_7_3_TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            // int x = 5 / 0;
            // int[] arr = {1, 2, 3, 4, 5};
            // System.out.println(arr[5]);
            System.out.print("H: ");
            int n = in.nextInt();
        }
        catch (ArithmeticException e){
            System.out.println("An illegal arithmetic expression was provided");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

    }
}
