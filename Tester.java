public class Tester {
    public static void printNums(int value, int numRounds){
        for (int i = 0; i < numRounds; i++){
            int randomNum = -1;
            while (randomNum != value){
                randomNum = (int)(Math.random() * 10);
                System.out.print(randomNum);
                if (randomNum == value){
                    System.out.println("");
                }
            }
        }
    }
    public static void main(String[] args) {
        printNums(5, 4);
    }
}
