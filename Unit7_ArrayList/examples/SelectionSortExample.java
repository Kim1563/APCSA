package Unit7_ArrayList.examples;

import java.util.ArrayList;

public class SelectionSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(9);
        list.add(12);
        list.add(1239817);
        list.add(-213);
        list.add(-1);
        list.add(-1);
        System.out.println(list);

        selectionSort(list);
        System.out.println(list);
    }

    public static void selectionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            Integer temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
