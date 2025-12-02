//BEST APPROACH FOR ME, IMPORTANT QUESTION
public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>>words = new HashMap<>();
      for(String word : strs){
        char[]okay = word.toCharArray();
        Arrays.sort(okay);
        String temp = Arrays.toString(okay);
        if(!words.containsKey(temp)){
            words.put(temp, new ArrayList<>());
        }
        words.get(temp).add(word);
      }
      return new ArrayList<>(words.values());
     }
