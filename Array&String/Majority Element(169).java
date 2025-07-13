//BRUTEFORCE METHOD : SORT THE ARRAY THEN THE MAJORITY ELEMENT THAT OCCURS MORE THAN N/2 TIMES WILL LIE IN THE CENTER.
public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
         return nums[n/2];
    }

//USING HASHMAP , SIMPLY UPDATING THE COUNT OF EACH KEY AND THEN TRAVERSING THE MAP TO RETURN THE KEY WITH VALUE GREATER THAN N/2;
public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(nums[0], 1);
        
        for (int i = 1; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                h.put(nums[i], h.get(nums[i]) + 1);
            } else {
                h.put(nums[i], 1);
            }
        }

        for (int key : h.keySet()) {
            if (h.get(key) > n) {
                return key;
            }
        }

        return -1; 
    }

//THE MOST EFFICIENT METHOD USING MOORE VOTING ALGORITHM , IT WILL ONLY RETURN THE ELEMENT IF IT EXISTS. LEAST TIME USED.
 public int majorityElement(int[] nums) {
     int count = 1;
     int candidate = nums[0];
     for(int i = 1; i<nums.length; i++){
        if(count == 0){
            candidate = nums[i];
            count = 1;
        }
        else if(nums[i] == candidate){
            count++;
        }
        else{
            count--;
        }
     }
     return candidate;
    }
