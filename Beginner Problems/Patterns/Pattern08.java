class Solution {
    public void pattern8(int n) {
        int count = 2 * n - 1;
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            spaces++;
            count -= 2;
            System.out.println();
        }
    }
}
