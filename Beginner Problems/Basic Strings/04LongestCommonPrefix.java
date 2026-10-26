class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        if (str == null || str.length == 0) {
            return "";
        }
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }
        return first.substring(0, i);
    }
}
