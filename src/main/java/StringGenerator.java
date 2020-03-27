public class StringGenerator {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder();
        int length = n;
        if (n%2 == 0) {
            length--;
            result.append("b");
        }
        for (int i = 0; i < length; i++) {
            result.append("a");
        }
        return result.toString();
    }
}
