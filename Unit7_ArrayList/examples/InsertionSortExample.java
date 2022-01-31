package Unit7_ArrayList.examples;

import java.util.ArrayList;

public class InsertionSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(2);

        insertionSort(nums);
        System.out.println(nums);
    }

    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++){

            int val = list.get(i); // Get the value to insert
            int pos = i; // Get the index of the position at which val will be inserted

            while (pos > 0 && list.get(pos - 1) > val){
                list.set(pos, list.get(pos - 1)); // Shift the value next to val to the right while it's greater
                pos--; // Decrement pos to continue checking
            }

            list.set(pos, val); // Inserts val at pos
        }
    }
}
