package Unit8_2dArrays.examples;

public class ClassExample {
    public static void main(String[] args) {
        int[][] myNums = {{2, 4, 6, 8}, {1, 3, 5, 7}, {22, 44, 66, 88}};

        System.out.println("The number 5 in the array: " + myNums[1][2]);
        System.out.println();

        int product = 1;
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < myNums[0].length; col++){
                product *= myNums[row][col];
            }
        }

        System.out.println("Product of first two rows: " + product);
        System.out.println();


    }
}
