import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n == 0){
            System.out.println(0);
            return;
        }
        while(n-->1){
            b = a + b;
            a = b- a;
        }
        System.out.println(b);
        
    }
}