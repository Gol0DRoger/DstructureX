//BRUTEFORCE APPROACH: We ill be using 2 pointers like nomrla duplicate removal.
public int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j =2; j<nums.length; j++){
            if(nums[j]==nums[i] && nums[i]!=nums[i-1]){
                i++;
                nums[i]= nums[j];
            }
            else if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            
        }return i+1;
            }
