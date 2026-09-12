class Solution {
    public boolean isAnagram(String s, String t) {
        int[] asci = new int[26];
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() == t.length()) {
            for(int i =0; i< s.length(); i++) {
                asci[s.charAt(i) - 'a']++;
                asci[t.charAt(i) - 'a']--;
            }
            
            for(int i=0;i<26;i++) {
                if(asci[i]!=0)
                    return false;
            }
            return true;
            
        }
        return false;
    }
}
