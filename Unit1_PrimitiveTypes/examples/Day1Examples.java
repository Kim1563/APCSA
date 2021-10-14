package Unit1_PrimitiveTypes.examples;

import java.util.*;

public class Day1Examples {

    public static int max(String[] array){
        int maxNum, currentNum;

        maxNum = Integer.parseInt(array[1]);
        for (String string : array) {
            currentNum = Integer.parseInt(string);
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        return maxNum;
    }

    public static int min(String[] array){
        int minNum, currentNum;

        minNum = Integer.parseInt(array[1]);
        for (String string : array) {
            currentNum = Integer.parseInt(string);
            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }

        return minNum;
    }

    public static double avg(String[] array){
        int total = 0;
        int count = 0;
        for (String string : array){
            int num = Integer.parseInt(string);
            total += num;
            count++;
        }

        return (double) total / count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Pick your favorite number from 1 - 100: ");
        int inputNum = in.nextInt();

        int randNum = (int)(Math.random() * 100) + 1;
        String[] arr = new String[randNum];

        for (int i = 0; i < arr.length; i++){
            int num = (int)(Math.random() * 100) + 1;
            arr[i] = String.valueOf(num);
        }

        for (String string : arr){
            System.out.print(string + " ");
        }
        System.out.println("");

        double average = avg(arr);
        double roundedAvg = (int)(average * 100) / 100.0;
        int max = max(arr);
        int min = min(arr);
        int length = arr.length;

        System.out.println("The length of the array is " + length);
        System.out.println("The average of the values in the array is " + roundedAvg);
        System.out.println("The maximum value in the array is " + max);
        System.out.println("The minimum value in the array is " + min);
    }
}
