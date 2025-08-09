//My Bruteforce approach , not super fast but not slow just few extra conditions. Understand with example. Time: 4ms
class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        for(int j =i+1; j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                //a=a+b, b=a-b; a=a-b but normal temp swapping is faster than arithmetic swapping
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
                i++;
            }
            if(nums[i]!=0){
                i++;
            }
        }
    }
}
//OPTIMIZED VERSION - use less single condition, Time: 1ms
https://leetcode.com/problems/move-zeroes/solutions/6884581/easy-to-understand-two-pointer-approach-using-single-for-loop-beats-100-0ms
class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        for(int j =0; j<nums.length; j++){
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i]= temp;
                i++;
            }
        }
    }
}
