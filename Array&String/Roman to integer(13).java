//This is my Original Solution: Simply using Conditional statements and While loop , simple and easy with Optimized time.
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int i = 0;
        char[] nums = s.toCharArray();
        
        while (i < nums.length) {
            if (nums[i] == 'I') {
                if (i != nums.length - 1 && nums[i + 1] == 'V') {
                    total += (5 - 1);
                    i += 2; // FIX 1: Skip both characters
                } else if (i != nums.length - 1 && nums[i + 1] == 'X') {
                    total += (10 - 1);
                    i += 2;
                } else {
                    total += 1;
                    i++;
                }
            } else if (nums[i] == 'X') {
                if (i != nums.length - 1 && nums[i + 1] == 'L') {
                    total += (50 - 10);
                    i += 2;
                } else if (i != nums.length - 1 && nums[i + 1] == 'C') {
                    total += (100 - 10);
                    i += 2;
                } else {
                    total += 10;
                    i++;
                }
            } else if (nums[i] == 'C') {
                if (i != nums.length - 1 && nums[i + 1] == 'D') {
                    total += (500 - 100);
                    i += 2;
                } else if (i != nums.length - 1 && nums[i + 1] == 'M') {
                    total += (1000 - 100);
                    i += 2;
                } else {
                    total += 100;
                    i++;
                }
            } else if (nums[i] == 'V') {   // FIX : Handle missing characters - V, L, D, M. (They are not individually added)
                total += 5;
                i++;
            } else if (nums[i] == 'L') {
                total += 50;
                i++;
            } else if (nums[i] == 'D') {
                total += 500;
                i++;
            } else if (nums[i] == 'M') {
                total += 1000;
                i++;
            }
        }

        return total;
    }
}

