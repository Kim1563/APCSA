package Unit4_Iteration.examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line

        for (int i = 0; i < mySchool.length(); i += 2){
            System.out.print(mySchool.substring(i, i + 1));
        }

        System.out.println("\n");

        // print the String mySchool in reverse (all characters on the same line)

        for (int i = mySchool.length() - 1; i >= 0; i--){
            System.out.print(mySchool.substring(i, i + 1));
        }

        System.out.println("");

         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String str = "monkey";

        for (int i = 0; i <= str.length(); i++){
            System.out.println(str.substring(0, i));
        }

        System.out.println("");

        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += " Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?

        int count = 0;
        while (phrase.indexOf("little") != -1){
            int index = phrase.indexOf("little");
            phrase = phrase.substring(index + 1);
            count++;
        }
        System.out.println("Count of string little in phrase: " + count);

        // int count = 0;
        // phrase = phrase.replaceAll("little", "/");
        // for (int i = 0; i < phrase.length(); i++){
            // if (phrase.charAt(i) == '/'){
                // count++;
            // }
        // }
        // System.out.println(count);



        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        String phrase2 = "Mary had a little lamb, little lamb, little lamb";
        phrase2 += " Mary had a little lamb, its fleece was white as snow";

        while (phrase2.indexOf("little") != -1){
            int index = phrase2.indexOf("little");
            phrase2 = phrase2.substring(0, index) + phrase2.substring(index + 6);
        }
        System.out.println("Phrase without string little: " + phrase2);
        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"

        String phrase3 = "Mary had a little lamb, little lamb, little lamb";
        phrase3 += " Mary had a little lamb, its fleece was white as snow";
        while (phrase3.indexOf("little") != -1){
            int index2 = phrase3.indexOf("little");
            phrase3 = phrase3.substring(0, index2) + "BIG" + phrase3.substring(index2 + 6);
        }
        System.out.println("Phrase with string little replaced with string BIG: " + phrase3);
    }
}
