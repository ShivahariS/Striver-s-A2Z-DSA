class Solution {
    public void pattern11(int n) {
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(num==0){
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print(num+" ");
                    num--;
                }
            }
            if(i%2!=0)
            num=1;
            else num=0;
            System.out.println();
        }
    }
}
