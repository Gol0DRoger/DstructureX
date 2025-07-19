//This is my Original Solution: Simply using Conditional statements and While loop , simple and easy with Optimized time (best).
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

//Less Optimized Approach but little cleaner and Less code - Using Hashmap to store default roman : Integer values and then checking same two characters at a time excluding last character/Index becoz it has to be added no matter what.
//If current indexed N is smaller than next Indexed N then subtract (-N) becoz after all it has to be subtracted same (Think) and if its greater than next then Add it.

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));     //last elemnt has to be added no matter What   
    }
}
