class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int num = arr[0];
        for(int i:arr){
            if(i<num)
            return false;
            num = i;
        }
        return true;
    }
}
