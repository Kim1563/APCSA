package Unit4_Iteration.lab;

import java.util.*;

public class PigLatinTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userResponse = "", userString = "";
        while (!userResponse.equalsIgnoreCase("N")){
            System.out.print("Enter a phrase: ");
            userString = in.nextLine();
            System.out.println("Your string: ");
        }

        String phrase1 = "The black cat ate a red apple";
        String phrase2 = "Writing college essays is driving me crazy";
        String phrase3 = "Everyone loves to code in Java";

        translatePhrase(phrase1);
        translatePhrase(phrase2);
        translatePhrase(phrase3);

    }

    public static void translatePhrase(String phrase) {
        System.out.println("In English:");
        System.out.println("\t" + phrase);
        System.out.println("In Pig Latin: ");
        System.out.println("\t" + PigLatin.toPigLatin(phrase));
        System.out.println();
    }

}
