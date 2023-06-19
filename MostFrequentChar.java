import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static char findMostFrequentChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!count.containsKey(c)) {
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }

        char best = ' ';
        for (char c : s.toCharArray()) {
            if (best == ' ' || count.get(c) > count.get(best)) {
                best = c;
            }
        }

        return best;
    }

    public static void main(String[] args) {
        String s = "helllloeee";
        char mostFrequentChar = findMostFrequentChar(s);
        System.out.println("Most frequent character in " + s + " is :" + mostFrequentChar);
    }
}
