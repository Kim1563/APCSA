package Unit4_Iteration.lab;

public class PigLatin {
    // String constant that stores vowels
    public static final String VOWELS = "aeiouAEIOU";

    // Returns whether a word starts with a vowel
    public static boolean startsWithVowel(String word){
        for (int i = 0; i < VOWELS.length(); i++){
            // Iterates through the vowels and returns true if the word starts with a vowel
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

        // Variable to hold consonants at start of word
        String returnWord = "";

        // Variable to reset index to 0 during loop
        int index = 0;

        // While word starts with a consonant, remove the consonant and add it to returnWord
        while (!startsWithVowel(word)){
            returnWord += word.substring(index, index + 1);
            word = word.substring(index + 1);
        }

        // Return word without consonants at front + consonants + " ay "
        return word + returnWord + "ay ";
    }


    public static String toPigLatin(String phrase){
        // Empty string to add translated words
        String newPhrase = "";

        // Iterates through phrase and translates words based on the spaces
        while (phrase.indexOf(" ") >= 0){
            newPhrase += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(" ")));
            phrase = phrase.substring(phrase.indexOf(" ") + 1);
        }

        // Accounts for the last word, which is not added to newPhrase in the loop
        String lastWord = phrase.substring(phrase.lastIndexOf(" ") + 1);

        // Adds the last word to newPhrase
        newPhrase = newPhrase + translateWordToPigLatin(lastWord);

        // All characters in newPhrase are made lower case
        newPhrase = newPhrase.toLowerCase();

        // Isolates and capitalizes the first character of the phrase and returns the character + rest of the phrase
        String firstChar = newPhrase.substring(0, 1);
        return firstChar.toUpperCase() + newPhrase.substring(1);

    }
}
