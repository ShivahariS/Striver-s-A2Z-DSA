class Solution {
    public void pattern18(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=i;j>0;j--) {
                System.out.print((char)('A' + n-j)+" ");
            }
            System.out.println();
        }
    }
}
