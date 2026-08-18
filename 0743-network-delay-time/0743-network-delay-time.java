class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE/2);
        dist[k]=0;
        dist[0]=0;

        for(int i=0;i<n-1;i++){
            for(int[] e:times){
                int u=e[0];
                int v=e[1];
                int w=e[2];
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
        int ans = Arrays.stream(dist).max().getAsInt();
        return ans == Integer.MAX_VALUE / 2 ? -1 : ans;
    }
}