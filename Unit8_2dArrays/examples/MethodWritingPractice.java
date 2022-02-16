package Unit8_2dArrays.examples;

public class MethodWritingPractice {
    public static void main(String[] args) {
        int[][] myNums = { {9, 7, 25, 3},
                           {29, 8, 22, 10},
                           {19, 16, 9, 1} };

        // Output the array in normal form
        showArray(myNums);
        System.out.println();

        // Output the average of all of the numbers in myNums
        double avg = getAvg(myNums);
        System.out.println("Average: " + avg);
        System.out.println();

        // Find the number of rows that contain at least one even number
        int evenCount = getEvenRowCount(myNums);
        System.out.println("Number of rows that contain an even number: " + evenCount);
        System.out.println();

        // Find the number of columns that contain at least one even number
        int evenCount1 = getEvenColumnCount(myNums);
        System.out.println("Number of columns that contain an even number: " + evenCount1);
        System.out.println();

    }

    // Output all elements of arr
    public static void showArray(int[][] arr){
        for (int[] row : arr){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Average of all elements in arr
    public static double getAvg(int[][] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
        }

        return sum / (arr.length * arr[0].length);
    }

    // Returns the number of rows in arr that contain at least one even number
    public static int getEvenRowCount(int[][] arr){
        int count = 0;
        boolean containsEven = false;

        for (int[] row : arr){
            for (int num : row){
                if (num % 2 == 0){
                    containsEven = true;
                }
            }
            if (containsEven){
                count++;
                containsEven = false;
            }
        }

        return count;
    }

    // Returns the number of columns in arr that contain at least one even number
    public static int getEvenColumnCount(int[][] arr){
        int count = 0;
        boolean containsEven = false;

        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] % 2 == 0) {
                    containsEven = true;
                }
            }
            if (containsEven){
                count++;
                containsEven = false;
            }
        }
        return count;
    }
}