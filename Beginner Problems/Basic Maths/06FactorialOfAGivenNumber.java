class Solution {
    public int factorial(int n) {
        int fact =1;
        if(n==0) return fact;
        do{
            fact = fact*n;
            n=n-1;
        }while(n!=0);
        return fact;
    }
}
