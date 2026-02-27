import java.util.*;
class Pair{
    Node a;
    int v; 
    public Pair(Node a,int v){
        this.a = a;
        this.v = v;
    }
}

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;
        Map<Integer,ArrayList<Integer>> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair f = q.remove();
            if(!m.containsKey(f.v)){
                m.put(f.v,new ArrayList<>());
            }
            m.get(f.v).add(f.a.data);
            //we need to add f.node.val in f.v map entry
            if(f.a.left != null){
                q.add(new Pair(f.a.left,f.v - 1));
            }
            if(f.a.right != null){
                q.add(new Pair(f.a.right,f.v + 1));
            }
        }
        //convert map to list
        for(ArrayList<Integer> x : m.values()){
            ans.add(x);
        }
        return ans;
    }
}