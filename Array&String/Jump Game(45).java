//The only greedy approach I found: https://www.youtube.com/watch?v=9kyHYVxL4fw


class Solution {
    public int jump(int[] nums) { 
        int jumps = 0;
        int destination = nums.length -1;

        int coverage =0;
        int lastJump = 0;
        if(nums.length == 1)return 0;
        for(int i =0; i<nums.length; i++){
            coverage = Math.max(coverage, i+nums[i]);
            if(i == lastJump){
                lastJump = coverage;
                jumps++;
            
            if(coverage>=destination){
                return jumps;
            }
            }
        }
        return jumps;
        }
    }
