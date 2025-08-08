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
// Slightly Optimized approach using HashSet:
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        for(int i =0; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}

//Most Optimal Solution/ Best Time complexity: 0(n)
class Solution {
    public int missingNumber(int[] nums) {
        int total = nums.length*(nums.length+1)/2;
        int sum =0;
        for(int n : nums){
            sum+=n;
        }
        return total-sum;
    }
}
