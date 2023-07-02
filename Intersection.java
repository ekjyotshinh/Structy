import java.util.Arrays;
import java.util.ArrayList;

public class Intersection {

    public static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> commonElementsList = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElementsList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int k = 0; k < commonElementsList.size(); k++) {
            commonElementsArray[k] = commonElementsList.get(k);
        }

        return commonElementsArray;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 5, 6, 8, 9 };

        int[] commonElements = intersection(arr1, arr2);

        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }
}
