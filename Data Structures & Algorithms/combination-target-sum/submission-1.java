class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(result, current, 0, target, nums);

        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> current, int i, int target, int[] nums) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (i >= nums.length || target < 0) {
            return;
        }

        current.add(nums[i]);
        backtrack(result, current, i, target - nums[i], nums);

        current.remove(current.size() - 1);
        backtrack(result, current, i + 1, target, nums);

    }
}
