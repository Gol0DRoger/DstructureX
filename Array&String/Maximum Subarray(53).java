//Bruteforce Approach: Normal Classic approach of calulating and increasing the subarray. O(n2)
class Solution {
    public int maxSubArray(int[] nums) {
        int prevsum = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int csum =0;
            for(int j =i;j<nums.length;j++){
                csum+=nums[j];
                if(csum>prevsum){
                    prevsum = csum;
                }
            }
        }
        return prevsum;
    }
}


//Optimized Approach: Kadane's algorithm
//Kadane’s Algorithm is a way to find the maximum sum of a subarray in a given array of integers (can have negative numbers too), in linear time.
// Idea:
//At each step:
//Either extend the current subarray or =>
//Start a new subarray from current element — whichever gives a higher sum.
https://www.youtube.com/watch?v=HCL4_bOd3-4
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0; i<nums.length; i++){
            currsum+=nums[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum =0;
            }
        }
        return maxsum;
    }
}
