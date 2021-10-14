package Unit4_Iteration.examples;

public class ForLoop {
    public static void main(String[] args) {
        // Print the even numbers from 0 to 20 on the same line with a space in between
        System.out.print("Even numbers from 0 to 20: ");
        for (int i = 0; i <= 20; i += 2){
            System.out.print(i + " ");
        }

        System.out.println("");

        // Print the multiples of 5 from 5 to 100 on the same line with a space in between
        System.out.print("Multiples of 5 from 5 to 100: ");
        for (int i = 0; i <= 100; i += 5){
            System.out.print(i + " ");
        }

        System.out.println("");

        // Print every character of String str with a space in between them
        System.out.print("Characters of String str with spaces: ");
        String str = "cookie";
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println("");

        // Print every character of String str in reverse order
        System.out.print("Reversed characters of String str: ");
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }

}
