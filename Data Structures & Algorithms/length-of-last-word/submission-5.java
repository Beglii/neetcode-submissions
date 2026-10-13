class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && (i + 1 != s.length())) {
                count = 0;
            }
            else {
                count++; 
                }
        }
        return count;
    }
}