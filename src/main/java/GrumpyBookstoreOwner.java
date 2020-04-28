public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int max = 0;
        int index = 0;
        int sum = 0;
        int result = 0;
        for (int j = 0; j < X - 1; j++) {
            sum += customers[j] * grumpy[j];
        }
        for (int i = 0; i < customers.length - X + 1; i++) {
            sum += customers[i + X - 1] * grumpy[i + X - 1];
            if (sum > max) {
                max = sum;
                index = i;
            }
            sum -= customers[i] * grumpy[i];
        }

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0 || i >= index && i < X + index) {
                result += customers[i];
            }
        }
        return result;
    }
}
