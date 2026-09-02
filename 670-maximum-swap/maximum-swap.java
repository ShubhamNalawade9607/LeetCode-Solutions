class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        // Store the last position of each digit
        int[] last = new int[10];

        for (int i = 0; i < digits.length; i++) {
            last[digits[i] - '0'] = i;
        }

        // Traverse from left to right
        for (int i = 0; i < digits.length; i++) {
            
            // Try to find a bigger digit from 9 to current + 1
            for (int d = 9; d > digits[i] - '0'; d--) {
                
                if (last[d] > i) {
                    // Swap
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;

                    return Integer.parseInt(new String(digits));
                }
            }
        }

        return num;
    }
}