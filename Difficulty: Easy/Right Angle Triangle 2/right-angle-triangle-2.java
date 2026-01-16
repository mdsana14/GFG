// User function Template for Java
class Solution {
    public static void triangle(int s) {
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i;j++){
                if(j == 1 || i == s||j == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}