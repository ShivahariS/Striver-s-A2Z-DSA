class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        int secondFreq = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                secondFreq = maxFreq;
                maxFreq = freq;
            } else if (freq < maxFreq && freq > secondFreq) {
                secondFreq = freq;
            }
        }
        if (secondFreq == 0) {
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        for (int num : map.keySet()) {
            if (map.get(num) == secondFreq) {
                ans = Math.min(ans, num);
            }
        }
        return ans;
    }
}

