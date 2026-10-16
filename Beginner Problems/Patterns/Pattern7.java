class Solution {
    public void pattern7(int n) {
        int count=1;
        int spaces = n-1;
        for(int i=0;i<n;i++){
            for(int j=spaces;j>0;j--){
                System.out.print(" ");
            }
            spaces--;
            for(int j=1;j<=count;j++){
                System.out.print("*");
            }
            count+=2;
            System.out.println();
        }
    }
}
