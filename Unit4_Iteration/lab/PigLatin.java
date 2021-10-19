package Unit4_Iteration.lab;

public class PigLatin {
    // String constant that stores vowels
    public static final String VOWELS = "aeiouAEIOU";

    // Returns whether a word starts with a vowel
    public static boolean startsWithVowel(String word){
        // Iterates through vowels and checks if the word starts with one of the vowels
        for (int i = 0; i < VOWELS.length(); i++){
            // If word starts with vowel, return true;
            if (word.indexOf(VOWELS.substring(i, i + 1)) == 0){
                return true;
            }
        }
        // Else return false
        return false;
    }

    // Converts one word to Pig Latin
    public static String translateWordToPigLatin(String word){
        // If word starts with vowel, return original word + "yay"
        if (startsWithVowel(word)){
            return word + "yay ";
        }

        // Initializes empty variables for index and starting consonants
        String returnWord = "";
        int index = 0;

        // While word starts with a consonant, add the consonant to the returnWord
        while (!startsWithVowel(word)){
            // Adds the consonant to returnWord
            returnWord += word.substring(index, index + 1);
            // Modifies word to exclude the selected consonant and shortens the string
            word = word.substring(index + 1);
        }

        // Returns truncated word + consonants + "ay "
        return word + returnWord + "ay ";
    }

    // Converts phrase to Pig Latin
    public static String toPigLatin(String phrase){
        // Initializes empty string for phrase
        String newPhrase = "";

        // Iterates through phrase by using the spaces
        while (phrase.indexOf(" ") >= 0){
            newPhrase += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(" ")));
            phrase = phrase.substring(phrase.indexOf(" ") + 1);
        }

        String lastWord = phrase.substring(phrase.lastIndexOf(" ") + 1);
        newPhrase = newPhrase + translateWordToPigLatin(lastWord);
        newPhrase = newPhrase.toLowerCase();
        String firstChar = newPhrase.substring(0, 1);
        return firstChar.toUpperCase() + newPhrase.substring(1);

    }
}
