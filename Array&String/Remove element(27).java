//First Approach using One "For and nested while loop" using TWO POINTERS.

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = n - 1;
        
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) {
                    j--; 
                }
                if (j >= i) {
                    
                    nums[i] = nums[j];
                    j--; 
                }
            }
        }
        int k = j+1;
        return k; 
    }

//The more optimized Version /OPTIMAL
//In this there are 2 pointers , one is Index/k with initial value 0 and a interative pointer i , The i will increment constantly but k will only increment when the sapping happens.
//https://leetcode.com/problems/remove-element/solutions/5468263/video-step-by-step-explanation
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
    return k;
    }



