class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int left = 0;
        int right = s.length()-1;
        while (right >= 0 && (s.charAt(right) - '0') % 2 == 0) {
            right--;
        }
        if (right < 0) {
            return "";
        }
        while (left <= right && s.charAt(left) == '0') {
            left++;
        }
        return s.substring(left, right + 1);
    }
}
