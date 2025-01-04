import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        boolean result = true;
        
        for(int i=0; i<ss.length; i++){
            if(ss.length != tt.length){
            result= false;
            break;
            }
            if(ss[i]!=tt[i]){
               result = false;
            }
            
        }
        return result;
     }
     public static void main(String[] args) {
         String a = "art";
         String b = "rat";

         Anagram ana = new Anagram();
         boolean r = ana.isAnagram(a, b);
         System.out.println(r);

     }
}

