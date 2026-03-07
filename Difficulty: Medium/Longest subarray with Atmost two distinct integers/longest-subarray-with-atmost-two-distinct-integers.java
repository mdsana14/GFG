class Solution {
    public int totalElements(int[] arr) {
        Map<Integer,Integer> f = new HashMap<>();
        int s=0,max=0,n=arr.length;
        if(arr.length == 1)return 1;
        else{
            for(int e=0;e<n;e++){
                int x = arr[e];
                f.put(x, 1+ f.getOrDefault(x,0));
                    while(f.size() > 2){
                        int y = arr[s];
                        f.put(y,f.get(y)-1);
                        if(f.get(y) == 0){
                            f.remove(y);
                        }
                        s++;
                    }              
                   max = Math.max(max,e-s+1); 
                }
                
        }
        return max;
    }
}