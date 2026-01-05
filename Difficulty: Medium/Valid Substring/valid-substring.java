class Solution {
    public int maxLength(String s) {
        Stack<Integer> st = new Stack<>();
        int m = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    m = Math.max(m,i - st.peek());
                }
            }
        }
        return m;
    }
}