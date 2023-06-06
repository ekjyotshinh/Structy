public class Uncompres {
    public static String uncomp(String s) {
        String result = "";
        // creating two pointers
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            // check if it is a digit , if yes then weincrement the j counter
            if (Character.isDigit(s.charAt(j))) {
                j++;
            } else {
                int num = Integer.parseInt(s.substring(i, j));
                char c = s.charAt(j);
                result += String.valueOf(c).repeat(num);
                j++;
                i = j;// bringing i to speed
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String compressedString = "3a2b4c";
        String uncompressedString = uncomp(compressedString);
        System.out.println(uncompressedString); // Output: aaabbcccc
    }
}
