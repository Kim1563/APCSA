package Unit4_Iteration.homework;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
        // Challenge 1
        for (int i = 5; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Challenge 2
        for (int i = 5; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println("");
        }

        System.out.println();

        everyOtherLetterPyramid("FremdVikings");
    }

    // Challenge 3
    public static void everyOtherLetterPyramid(String str){
        String origStr = str;
        System.out.println(str);
        while (origStr.length() > 1) {
            String printStr = "";
            for (int i = 0; i < origStr.length(); i += 2) {
                printStr += origStr.substring(i, i + 1);
            }

            System.out.println(printStr);
            origStr = printStr;
        }
    }
}
