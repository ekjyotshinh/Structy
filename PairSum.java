import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static int[] findPairSum(int[] numbers, int targetSum) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int complement = targetSum - num;
            if (complementMap.containsKey(complement)) {
                int complementIndex = complementMap.get(complement);
                return new int[] { complementIndex, i };
            }
            complementMap.put(num, i);
        }
        return new int[] { -1, -1 }; // Return [-1, -1] if no pair is found
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int targetSum = 9;
        int[] result = findPairSum(numbers, targetSum);
        System.out.println("Pair indices: [" + result[0] + ", " + result[1] + "]");
    }
}
