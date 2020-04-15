public class RepeatedElement {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int el = A[i];
            for (int j = 0; j < A.length && i != j; j++) {
                if (el == A[j]) {
                    return A[i];
                }
            }
        }
        return 0;
    }
}
