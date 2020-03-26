public class OuterParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        char[] charArray = S.toCharArray();
        int tempSum = 0;
        for (char s : charArray) {
            if (tempSum == 0 && s == '(') {
                tempSum++;
            } else if (tempSum == 1 && s == ')') {
                tempSum--;
            } else if (tempSum > 0) {
                result.append(s);
                if (s == '(') {
                    tempSum++;
                } else {
                    tempSum--;
                }
            }
        }
        return result.toString();
    }
}
