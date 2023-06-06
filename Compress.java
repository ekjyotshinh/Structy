public class Compress {
    public static String comp(String s) {
        String result = "";
        // creating two pointers
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            // check if it is a digit , if yes then weincrement the j counter
            if (s.charAt(j) == s.charAt(i)) {
                j++;
            } else {
                if (j - i == 1) {
                    char c = s.charAt(i);
                    result += String.valueOf(c);
                    i = j;// bringing i to speed

                } else {
                    char c = s.charAt(i);
                    result += j - i + String.valueOf(c);
                    i = j;// bringing i to speed
                }
            }
        }
        if ((s.charAt(j - 1) == s.charAt(i)) && (j == s.length())) {
            char c = s.charAt(j - 1);
            result += j - i + String.valueOf(c);
        }

        return result;
    }

    public static void main(String[] args) {
        String uncompressedString = "aaayyyqwwwwww";
        String compressedString = comp(uncompressedString);
        System.out.println(compressedString);// output
    }
}
