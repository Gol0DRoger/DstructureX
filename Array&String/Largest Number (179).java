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
