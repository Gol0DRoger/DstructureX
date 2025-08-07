//Bruteforce Method:
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
            if(nums[nums.length-1]!=nums.length){
                return nums.length;
            }
        }
        return 0;
    }
}
//Optimized approach:
