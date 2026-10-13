class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = (l + r) / 2;

        while (l <= r) {
            if (nums[m] > target) {
                r = m -1;
                m = l + r / 2;
            } else if (nums[m] < target) {
                l = m+1;
                m = l + r / 2;
            } else {
                return m;
            }
        }
        return -1; 
    }
}
