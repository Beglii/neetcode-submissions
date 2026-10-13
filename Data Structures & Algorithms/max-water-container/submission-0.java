class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int currentMax = 0;
        int totalMax= 0;

        while (l < r) {
            currentMax = (r - l) * Math.min(heights[l], heights[r]);
            totalMax = Math.max(currentMax, totalMax);

            if (heights[l] < heights[r]) {
                l++;
            } else if (heights[r] < heights[l]) {
                r--;
            } else {
                l++;
            }
        }
        return totalMax;
    }
}
