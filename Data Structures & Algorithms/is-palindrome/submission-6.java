class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int right = chars.length-1;
        int left = 0;
        while ( left <= right) {
            while (left <= right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            while (left <= right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            if (left > right) {
                break;
            }
            if (chars[left] != chars[right]) {
                return false;
            }
            right--;
            left++;
        }
            return true;
    }
}
