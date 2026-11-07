class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                System.out.println(mid);
                r = mid - 1;
            } else if (nums[mid] < target) {
                System.out.println(mid);
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
