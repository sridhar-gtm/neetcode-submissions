class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length() + "#" + s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> sl = new ArrayList<String>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i);
            int l = Integer.parseInt(str.substring(i, j));
            sl.add(str.substring(j+1, j+l+1));
            i = j+l+1;
        }
        return sl;
    }
}
