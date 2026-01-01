// User function Template for Java
class Solution {
    public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
        int m = 0;
        for(int i=0;i<arr.size();i++){
            m = Math.max(m,arr.get(i).size());
        }
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int s = 0;
            for(int j=0;j<arr.size();j++){
                if(i<arr.get(j).size()){
                    s += arr.get(j).get(i);
                }
            }
            mn = Math.min(mn,s);
        }
        return mn;
    }
}