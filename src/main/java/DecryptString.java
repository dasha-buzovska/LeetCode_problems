public class DecryptString {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int number = Integer.parseInt(s.substring(i-2, i));
                result.append((char) (number + 96));
                i -= 2;
            } else {
                int number = s.charAt(i) - 48;
                result.append((char)(number + 96));
            }
        }
        return result.reverse().toString();
    }
}
