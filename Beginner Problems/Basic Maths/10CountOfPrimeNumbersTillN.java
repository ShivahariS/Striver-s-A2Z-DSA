class Solution {
    public int primeUptoN(int n) {
        int count = 0;
        for (int i=2;i<=n;i++) {
            boolean isPrime = true;
            for (int j=2;j<=i/j;j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
