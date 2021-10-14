package Unit4_Iteration.lab;

public class PigLatin {
    // String constant that stores vowels
    public static final String VOWELS = "aeiouAEIOU";

    // Returns whether a word starts with a vowel
    public static boolean startsWithVowel(String word){
        for (int i = 0; i < VOWELS.length(); i++){
            if (word.indexOf(VOWELS.substring(i, i + 1)) == 0){
                return true;
            }
        }
        return false;
    }

    // Converts one word to Pig Latin
    public static String translateWordToPigLatin(String word){
        // If word starts with vowel, return original word + "yay"
        if (startsWithVowel(word)){
            return word + "yay ";
        }

        String firstLetter = word.substring(0, 1);
        return word.substring(1) + firstLetter + "ay ";
    }


    public static String toPigLatin(String phrase){
        String newPhrase = "";
        while (phrase.indexOf(" ") >= 0){
            newPhrase += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(" ")));
            phrase = phrase.substring(phrase.indexOf(" ") + 1);
        }
        return newPhrase;
    }
}
