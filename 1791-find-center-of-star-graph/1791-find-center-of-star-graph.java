class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[i].length;j++){
                int val=edges[i][j];
                if(map.containsKey(val)){
                    map.put(val,map.get(val)+1);
                }
                else{
                    map.put(val,1);
                }
            }
        }
        if(map.get(edges[0][0])==edges.length){
            return edges[0][0];
        }
        return edges[0][1];
    }
}