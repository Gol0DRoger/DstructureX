
//BRUTE FORCE APPROACH :
//In this we are first adding both and then sorting all the elements of array.
 public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i =m; i<m+n; i++){
        nums1[i] = nums1[i]+ nums2[(i+n)-(m+n)];
       }
       for(int j =0; j<(m+n)-1; j++){
        for(int i=j+1; i<m+n; i++){
            if(nums1[j]> nums1[i]){
                int s = nums1[j];
                nums1[j]=nums1[i];
                nums1[i]= s;

            }
        }
       }
    }

//OPTIMIAL APPROACH:
//Here we are using 3 pointers i, j , k wil make its time complexity 0 ms. O(n)
public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j = n-1;
       int k = (m+n)-1;
       while(j>=0){
        if(i>=0 && nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }
        else{
            nums1[k--]=nums2[j--];
        }
       }
    }
