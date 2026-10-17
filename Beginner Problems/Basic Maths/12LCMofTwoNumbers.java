class Solution {
    public int LCM(int n1, int n2) {
        int a=n1;
        int b=n2;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }

        return (n1/a)*n2;
    }
}
