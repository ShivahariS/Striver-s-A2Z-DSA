class Solution {  
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        for(char ch: map1.keySet()){
            if(!map1.get(ch).equals(map2.get(ch)))
            return false;
        }
        return true;
    }
}
