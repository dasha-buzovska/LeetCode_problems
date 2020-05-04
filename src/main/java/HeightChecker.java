import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] ints = heights.clone();
        Arrays.sort(ints);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != ints[i]) {
                result++;
            }
        }
        return result;
    }
}
