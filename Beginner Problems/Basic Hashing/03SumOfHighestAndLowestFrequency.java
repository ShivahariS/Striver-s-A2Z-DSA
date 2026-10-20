class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int hFreq=0;
        int lFreq = Integer.MAX_VALUE;
        for(int num:map.keySet()){
            if(hFreq<=map.get(num)){
                hFreq = map.get(num);
            }
            if(lFreq>=map.get(num)){
                lFreq = map.get(num);
            }
        }
        return hFreq+lFreq;
    }
}
