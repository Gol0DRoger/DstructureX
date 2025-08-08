https://www.youtube.com/watch?v=Fm_p9lJ4Z_8

//Bruteforce approach: using a temp variable and i pointer and k counting and one extra array.
public int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int n = nums.length;
        int k =1;
        int[] arr = new int[n];
        arr[0]= temp;
        for(int i=1; i<=n-1; i++){
         if(temp != nums[i]){
                temp = nums[i];
                arr[k]=temp;
                k++;

            }
        }
        for(int j =1; j<k; j++){
            nums[j]=arr[j];
        }
        return k;
    }

//My Latest Bruteforce approach:
class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length-1; i++){
int semicount =0;
for(int j = i+1; j<nums.length; j++){
if(nums[i]==nums[j] && nums[i]!=Integer.MAX_VALUE){
    semicount++;
    nums[i]=Integer.MAX_VALUE;
}
}
count+=semicount;
        }
        Arrays.sort(nums);
        return (nums.length-count);
    }
}

//Optimal approach: Without using any extra array and only using two pointers. Moving i only when swaping is about to happen with jth element.
public int removeDuplicates(int[] nums) {
    int n = nums.length;
    int i = 0;
    for(int j =1; j<n; j++){
        if(nums[j]!= nums[i]){
            nums[i]=nums[j];
            i++;
        }
    }
    return i+1;
    }
//==================================================================================================================//
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        if(nums.length==0) return 0;
        for(int i =1; i<nums.length; i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
