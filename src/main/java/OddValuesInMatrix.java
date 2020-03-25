public class OddValuesInMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] resultArr = new int[n][m];
        for (int[] index : indices) {
            int row = index[0];
            int column = index[1];
            for (int j = 0; j < m; j++) {
                resultArr[row][j]++;
            }
            for (int j = 0; j < n; j++) {
                resultArr[j][column]++;
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (resultArr[i][j]%2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
