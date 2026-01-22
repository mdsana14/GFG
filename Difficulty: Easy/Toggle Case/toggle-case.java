class Solution {
    public String toggleCase(String s) {
        int n = s.length();
        StringBuilder r = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                r.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                r.append(Character.toUpperCase(c));
            }
        }
        return r.toString();
        
    }
}
