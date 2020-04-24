public class PeakElement {
    public int findPeakElement(int[] nums) {
        int index = 0;
        if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i] || (nums[i - 1] < nums[i] && i == nums.length - 1 || nums[i + 1] < nums[i])) {
                    index = i;
                    break;
                }
            }
            return index;
        }
    }
}
