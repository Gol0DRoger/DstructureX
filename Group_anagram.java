class Grooup_anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<char[]> sor = new ArrayList<>();
        List<String> originalStrings = new ArrayList<>(Arrays.asList(strs));

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            sor.add(charArray);
        }

        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(originalStrings.get(i));

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j]) continue;

                if (Arrays.equals(sor.get(i), sor.get(j))) {
                    group.add(originalStrings.get(j));
                    visited[j] = true;
                }
            }
            result.add(group);
        }

        return result;
    }
}
