//Bruteforce approach using one extra array and standard formula ne position of every element => (i+k) % nums.length
public void rotate(int[] nums, int k) {
      int n = nums.length;
      int temp = 0;
      int [] r = new int[n];
      for(int i =0; i<n; i++){
         r[(i+k)%n] = nums[i];
      }
      for(int j =0 ; j<n ; j++){
        nums[j] = r[j];
      }
}

//Optimized approach : By Reversing the Array 3 times , 1st time full array , next Revrse of first k elemnts then last reverse of elememts after k => n-k elemnts.
// Using Reverse Function :
public void rotate(int[] nums, int k) {
        k = k % nums.length;
            Reverse(nums, 0, nums.length-1);
            Reverse(nums, 0, k-1);  
            Reverse(nums, k, nums.length-1);       
            }
    
    public static void Reverse (int[]arr , int l , int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }

}

