import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean r = true;
        for(int i=2;i<n;i++){
            if(n % i == 0){
                r = false;
                break;
            }
        }
        if(r){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}