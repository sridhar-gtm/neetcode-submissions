class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> hmap = 
                                new HashMap<String, ArrayList<String>>();
        for(String st : strs) {
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            hmap.computeIfAbsent(k, key -> new ArrayList<String>()).add(st);
        }
        return hmap.values().stream().collect(Collectors.toList());

    }
}
