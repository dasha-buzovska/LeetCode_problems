import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int occurrences = 1;
            int j = i+1;
            while (j < arr.length && arr[j] == arr[i]) {
                occurrences++;
                j++;
            }
            i = --j;
            result.add(occurrences);
        }
        return new HashSet<>(result).size() == result.size();
    }
}
