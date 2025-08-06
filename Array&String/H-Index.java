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

//OPTIMIZED APPROACH:
