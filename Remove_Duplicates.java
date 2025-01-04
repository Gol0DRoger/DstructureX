public class Remove_Duplicates{

        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            
            int k = 1;
            
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] != nums[i-1]) {
                    nums[k] = nums[i];//It will just copy element from one position to destination postion without disturbing the last position.
                    k++;
                }
            }
            return k;
            
        }
        public static void main(String[] args) {
            int[]arr = {1,1,2,2,3,4,4,5,5,6};
            Remove_Duplicates r = new Remove_Duplicates();
            int count = r.removeDuplicates(arr);
            System.out.println(count);
        }
    }

