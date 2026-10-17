class Solution {
    public boolean isPalindrome(int n) {
        int reverse=0;
        int num =n;
        do{
            reverse= (reverse*10)+n%10;
            n=n/10;
        }while(n!=0);
        if(reverse==num)
        return true;
        else return false;
    }
}
