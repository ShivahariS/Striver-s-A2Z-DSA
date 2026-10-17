class Solution{
    public int countOdd(int[] arr, int n) {
       int count=0;
       for(int i:arr){
        if(i%2!=0)
        count++;
       }
       return count;
    }
}
