class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = l + r / 2;

        while (nums[m] != target) {
            if (nums[m] > target) {
                r = m;
                m = l + r / 2;
            } else if (nums[m] < target) {
                l = m;
                m = l + r / 2;
            }
        }
        return m;
    }
}
