class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int C = target - nums[i];

            if (map.containsValue(C)) {
                return new int[] {map.get(nums[i]), i};
            } else {
                map.add(nums[i], i);
            }
        }

        return new int[0];

    }
}
