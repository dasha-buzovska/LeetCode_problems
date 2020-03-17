/*
* Given the array nums, for each nums[i] find out how many numbers in the array are smaller
* than it. That is, for each nums[i] you have to count the number of valid j's such
* that j != i and nums[j] < nums[i].
* Return the answer in an array.
* */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed().sorted()
                .collect(Collectors.toList());
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.indexOf(nums[i]);
        }
        return result;
    }
}
