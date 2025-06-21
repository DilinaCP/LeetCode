class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> numbers = new HashMap<>();

        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = numbers.get(s.charAt(i));

            if (i < s.length() - 1 && current < numbers.get(s.charAt(i + 1))) {
                total -= current; // Subtract if smaller than next
            } else {
                total += current; // Otherwise add
            }
        }

        return total;
    }
}
