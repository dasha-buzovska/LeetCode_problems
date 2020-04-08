import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int index = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            int max = matrix[i][index];
            int count = 0;
            for (int k = 0; k < matrix.length; k++) {
                if (max < matrix[k][index]) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == matrix.length) {
                result.add(max);
            }
        }
        return result;
    }
}
