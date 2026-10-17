class Solution {
    public int reverseNumber(int n) {
        int reverse=0;
        do{
            reverse= (reverse*10)+n%10;
            n=n/10;
        }while(n!=0);
        return reverse;
    }
}
