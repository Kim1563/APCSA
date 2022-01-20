package Unit7_ArrayList.examples;

import java.util.ArrayList;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Notes_7_4_Examples {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);

        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);

        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);

        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

        System.out.println(numsNoRepeats);
        System.out.println(numsRepeats);
        System.out.println(orderedNums);
        System.out.println(names);

        System.out.println("Min value of numsNoRepeats: " + findMin(numsNoRepeats));
        System.out.println("Min value of numsRepeats: " + findMin(numsRepeats));
        System.out.println("Min value of orderedNums: " + findMin(orderedNums));

        System.out.println("Max value of numsNoRepeats: " + findMax(numsNoRepeats));
        System.out.println("Max value of numsRepeats: " + findMax(numsRepeats));
        System.out.println("Max value of orderedNums: " + findMax(orderedNums));

        System.out.println("Sum of numsNoRepeats: " + findSum(numsNoRepeats));
        System.out.println("Sum of numsRepeats: " + findSum(numsRepeats));
        System.out.println("Sum of orderedNums: " + findSum(orderedNums));

        System.out.println("Avg value of numsNoRepeats: " + findAverage(numsNoRepeats));
        System.out.println("Avg value of numsRepeats: " + findAverage(numsRepeats));
        System.out.println("Avg value of orderedNums: " + findAverage(orderedNums));

        System.out.println("Whether findMin is increasing" + findMin(numsNoRepeats));
        System.out.println("Whether numsRepeats is increasing: " + findMin(numsRepeats));
        System.out.println("Whether orderedNums is increasing: " + findMin(orderedNums));

        System.out.println("Whether names has duplicates: " + hasDuplicates(names));

        System.out.println("Names but reversed: " + revArrayList(names));

        shiftLeft(names);
        System.out.println("Names but shifted: " + names);
    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int temp = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < temp){
                temp = list.get(i);
            }
        }
        return temp;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int temp = list.get(0);
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i + 1) > temp){
                temp = list.get(i + 1);
            }
        }
        return temp;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int temp = 0;
        for (int i:list){
            temp += i;
        }
        return temp;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        return (double)findSum(list) / list.size();
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++){
            if (!(list.get(i + 1) > list.get(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        for (int j = 0; j < list.size() - 1; j++){
            for (int i = j + 1; i < list.size(); i++){
                if (list.get(j).equals(list.get(i))){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> revList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--){
            revList.add(list.get(i));
        }
        return revList;
    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
        list.add(list.remove(0));
    }


}