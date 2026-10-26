class Solution {    
    public List<Character> frequencySort(String s) {
        // Your code goes here
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> result = new ArrayList<>(freq.keySet());

        Collections.sort(result, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a);
            }
            return Character.compare(a, b);
        });

        return result;

    }
}
