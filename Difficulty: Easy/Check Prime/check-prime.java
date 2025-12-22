class Solution {
    public static boolean prime(int n) {
        boolean ans = false;
        int c = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                c++;
            }
        }
        if(c==2){
            ans = true;
        }
        else{
            ans = false;
        }
            
        return ans;
        
    }
}