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
