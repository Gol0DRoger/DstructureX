//This is my bruteforce approach where I Taking the Range of H-Index: 0 to Greatest element in the array.
//H - Index of a researcher is a any number h that has h papers which have atleast h citations.
//This approach includes first finding the lagest element of the array , then traversing the first loop from 0 to largest/great element->
//then running a nested loop whic traverses the elements of array and compare them (greater or equal to the number of first loop)if its greater than increase its count and check the count to be greater than tha number(1st lopp).
//If its greater than the count then add to the arraylist and in the end , return the largest element of array list.
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length -1;
        int a =0;
        ArrayList<Integer> eligible = new ArrayList<>();
int great =0;
for(int nz : citations){
    if(nz>great){
        great=nz;
    }
}
        for(int i=0; i<=great; i++){
            int count = 0;
            for(int k = 0; k<=n; k++){
                if(citations[k]>=i){
                    count++;
                }
            }
            if(count>=i){
                eligible.add(i);
            }
        }
        
        
        for(int num : eligible){
            if(num>a){
                a=num;
            }
        }
        return a;
    }
}

//OPTIMIZED APPROACH: Most optimized approach , best optimization - Best Solution.
https://youtu.be/8KpirgdcXgE?feature=shared
//explanation:
/* You create a frequency array arr to count how many papers have each citation count.
If a citation is more than n, you count it in arr[n].
You loop from highest to lowest citation count (i = n to 0), summing how many papers have at least i citations.
When the total papers ≥ i, you return i as the H-Index.
If no such i is found, you return 0. */

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int arr[] = new int[n+1];
        for(int num : citations){
            if(num>n){
                arr[n]++;
            }
            else{
                arr[num]++;
            }
        }
        int count =0;
        for(int i=n; i>=0; i-- ){
            count = count+arr[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}

