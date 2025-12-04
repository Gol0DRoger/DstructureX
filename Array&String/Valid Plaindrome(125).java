
//Two-Pointer approach Just skip and check -> BEST 
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
      while(i<j){
       if(!Character.isLetterOrDigit(s.charAt(i))){
        i++;
       }
       else if(!Character.isLetterOrDigit(s.charAt(j))){
        j--;
       }
       else {
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
        return false;
       }
       i++;
       j--;
       }
      }
      return true;
    }
    
}

//Using Regex -> Regular expressions BUT less Optimized and less efficient
/*
replaceAll(...)
replaceAll() is a method that replaces parts of a string that match a regular expression (regex).
Syntax:  string.replaceAll(regex, replacementString)
*/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
        return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
