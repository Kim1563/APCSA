package Unit4_Iteration.examples;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 10) + 1;
        int count = 0;
        boolean isCorrect = false;

        while (!isCorrect){
            int guess = in.nextInt();

            if (guess < randomNum){
                System.out.println("Your guess was too low");
                in.nextInt();
            } else if (guess > randomNum){
                System.out.println("Your guess was too high");
                in.nextInt();
            } else {
                isCorrect = true;
                System.out.println("Congrats! You guessed the number " + randomNum + " in " + count + "guesses.");
            }
        }
    }
}
