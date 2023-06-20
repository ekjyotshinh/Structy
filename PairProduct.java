import java.util.HashMap;
import java.util.Map;

public class PairProduct {
    public static int[] pairProduct(int[] numbers, int targetProduct) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num != 0 && targetProduct % num == 0) {
                int complement = targetProduct / num;
                if (complementMap.containsKey(complement)) {
                    int complementIndex = complementMap.get(complement);
                    return new int[] { complementIndex, i };
                }
                complementMap.put(num, i);
            }
        }
        return new int[] { -1, -1 }; // Return [-1, -1] if no pair is found
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5 };
        int targetProduct = 8;
        int[] result = pairProduct(numbers, targetProduct);
        System.out.println("Pair indices: [" + result[0] + ", " + result[1] + "]");

    }
}
