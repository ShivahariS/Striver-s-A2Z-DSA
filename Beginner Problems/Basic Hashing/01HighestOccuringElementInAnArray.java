class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey((nums[i]))){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int highest=0;
        int freq=0;
        for(int num:map.keySet()){
            if(freq<map.get(num)){
                highest = num;
                freq = map.get(num);
            }else if (map.get(num)==freq&&num<highest) {
                highest = num;
            }
        }
        return highest;
    }
}


