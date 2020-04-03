public class InvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0; j < length/2 + length%2; j++) {
                int buffer = A[i][j];
                A[i][j] = (A[i][length - 1 - j] + 1)%2;
                A[i][length - 1 - j] = (buffer + 1)%2;
            }
        }
        return A;
    }
}
