class Solution {
    public int largestDigit(int n) {
        int largDig=0;
        int digit=0;
        do{
            digit=n%10;
            n=n/10;
            if(digit>largDig)largDig=digit;
        }while(n!=0);
        return largDig;
    }
}
