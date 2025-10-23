//Optimized and Standard Solution
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char temp = s.charAt(i);
            m.put(temp,m.getOrDefault(temp,0)+1);
            //This is also right.
            /*if(m.containsKey(temp)==true){
                m.put(temp, m.get(temp)+1);
            } 
            else{
                m.put(temp,1);
            }*/
        }

      for(int j =0 ; j<s.length(); j++){
        if(m.get(s.charAt(j))==1){
            return j;
        }
      }
        return -1;
    }
}
