public class StringMatch {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[length + 1];
        int smallest = 0;
        int biggest = length;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'D') {
                result[i] = biggest--;
            } else {
                result[i] = smallest++;
            }
        }
        result[length] = smallest;
        return result;
    }
}
