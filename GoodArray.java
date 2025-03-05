//Check if Array is Good
class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int j=0;
        Arrays.sort(nums);
        int x = n-1;
       for(int i =0; i<n; i++){
        if(nums[i]==x && nums[n-1]==x){
            j++;
        }
       }for(int k =1; k<n-2; k++){
        if(nums[k]==nums[k-1]){
        j--;
        }
       }
       if(j==2){
        return true;
       }
       else{
        return false;
       }

    }
}
