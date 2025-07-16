//This is the only understandable solution I found,
//We have several ways to reach goal(= the last index) or other index from a current position, so my strategy is to move goal to left position when we meet a simple condition.
//The condition is : if current position + maximum jump >= goal
//If we meet the condition we update goal with current index.
public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal==0;
    }
