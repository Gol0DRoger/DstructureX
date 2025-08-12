//BruteForce But it is MORE OPTIMIZED BETTER SOLUTION :
https://www.youtube.com/watch?v=UZG3-vZlFM4
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];
        for(int i = 1; i<n; i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans =0;
        for(int i=0;i<n;i++){
          ans = ans + (Math.min(right[i],left[i])-height[i]);
        }
        return ans;
    }
}

// 2 POINTERS APPROACH almost same time complexity. 1 ms -> o(n)
https://www.youtube.com/watch?v=UHHp8USwx4M&t=10s
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int Lmax= 0;
        int Rmax=0;
        int ans =0;
        while(l<r){
            Lmax = Math.max(Lmax,height[l]);
            Rmax = Math.max(Rmax,height[r]);
            if(Lmax<Rmax){
                //Left
ans = ans + (Lmax-height[l]);
l++;
            }
            else{
                //Right
                ans = ans +(Rmax-height[r]);
                r--;
            }
        }
        return ans;
    }
}
