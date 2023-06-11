import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        Map<Character, Integer> count1 = getCharacterCount(str1);
        Map<Character, Integer> count2 = getCharacterCount(str2);
        return count1.equals(count2);
    }

    private static Map<Character, Integer> getCharacterCount(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            }
            count.put(ch, 0);
        }
        return count;
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        System.out.println(areAnagrams(string1, string2)); // Output: true

        String string3 = "eleven plus two";
        String string4 = "twelve plus one";
        System.out.println(areAnagrams(string3, string4)); // Output: true

        String string5 = "hello";
        String string6 = "world";
        System.out.println(areAnagrams(string5, string6)); // Output: false

        String string7 = "debitcard";
        String string8 = "badcredit";
        System.out.println(areAnagrams(string7, string8)); // Output: true

        String string9 = "clinteastwood";
        String string10 = "oldwestaction";
        System.out.println(areAnagrams(string9, string10)); // Output: true

        String string11 = "open";
        String string12 = "close";
        System.out.println(areAnagrams(string11, string12)); // Output: false
    }

}
