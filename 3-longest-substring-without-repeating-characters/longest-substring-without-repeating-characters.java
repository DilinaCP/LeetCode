class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seenchars = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right< s.length()){
            char current = s.charAt(right);

            if (!seenchars.contains(current)) {
                seenchars.add(current);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If duplicate, shrink window from the left
                seenchars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}