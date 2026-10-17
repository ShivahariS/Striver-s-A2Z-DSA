class Solution {
    public boolean isArmstrong(int n) {
        int digit=0;
        int num=n;
        int sum=0;
        do{
            num=num/10;
            digit++;
        }while(num!=0);
        num=n;
        do{
            sum += (int)Math.pow(num%10,digit);
            num=num/10;
        }while(num!=0);
        if(sum==n) return true;
        else return false;
    }
}
