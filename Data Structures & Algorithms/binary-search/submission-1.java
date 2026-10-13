class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = l + r / 2;

        for(int i = 0; i < nums.length; i++) {
            if (nums[m] > target) {
                r = m;
                m = l + r / 2;
            } else if (nums[m] < target) {
                l = m;
                m = l + r / 2;
            } else {
                return m;
            }
        }
        return -1; 
    }
}
