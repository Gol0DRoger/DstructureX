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

//Optimized approach 
