class Solution {
    public int countDigit(int n) {
        int count=0;
        do{
            n=n/10;
            count++;
        }while(n!=0);
        return count;
    }
}
