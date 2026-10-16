class Solution {
    public void pattern21(int n) {
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=' ';
                if(i==0||i==n-1||j==0||j==n-1)
                arr[i][j]='*';
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
