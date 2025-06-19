class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed_n = 0;
        while (x > 0) {
            reversed_n = reversed_n * 10 + x % 10;
            x = x / 10;
        }
        return original == reversed_n; 
    }
}