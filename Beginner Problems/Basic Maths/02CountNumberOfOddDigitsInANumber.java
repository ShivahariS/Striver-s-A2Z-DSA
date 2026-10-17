class Solution {
    public int countOddDigit(int n) {
        int count=0;
        int digit=0;
        do{
            digit=n%10;
            n=n/10;
            if(digit%2!=0) count++;
        }while(n!=0);
        return count;
    }
}
