//Bruteforce Approach - Greedy + Pointers + Strings
https://www.youtube.com/watch?v=x0pc-z2BxPM
class Solution {
    public String largestNumber(int[] nums) {
        for(int i =0; i<nums.length-1;i++){
            int j = i+1;
            while(j<nums.length){
                String a = String.valueOf(nums[i]);
                String b = String.valueOf(nums[j]);
                if((b + a).compareTo(a + b) > 0){
int temp = nums[i];
nums[i]= nums[j];
nums[j]= temp;
                }
                j++;
            }
        }
        if(nums[0]==0){
            return String.valueOf(nums[0]);
        }
StringBuilder f = new StringBuilder(); //More efficient than manual String Looping
for (int num : nums) {
    f.append(num);
}
return f.toString();
}
}



// OPTIMIZED APPROACH USING CUSTOM SORTING  , Initially I tried arrayList but Array is little more efficient. (5ms time
)https://algo.monster/liteproblems/179
class Solution {
    public String largestNumber(int[] nums) {
         String[] arr = new String[nums.length];
    

    for (int i = 0; i < nums.length; i++) {
        arr[i] = String.valueOf(nums[i]);
    }

    Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

    if (arr[0].equals("0")) {
        return "0";
    }

    StringBuilder sb = new StringBuilder();
    for (String s : arr) {
        sb.append(s);
    }
    String f = sb.toString();
    return f;
}
}
