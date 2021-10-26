package Unit5_Classes.homework.FRQs;

public class CodingBat {
    public static String notReplace(String str) {
        String returnStr = "";
        if (str.length() < 2){
            returnStr = str;
        } else if (str.equals("is")){
            returnStr = "is not";
        } else if (str.indexOf("is") == 0){
            if (!Character.isLetter(str.charAt(str.indexOf("is") + 2))){
                returnStr = "is not" + str.substring(str.indexOf("is") + 2);
            } else {
                returnStr = str;
            }
        } else {
            returnStr = str.substring(0, str.indexOf("is"));

        }
        return returnStr;
    }

    public static void main(String[] args) {

    }
}
