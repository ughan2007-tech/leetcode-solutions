class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
      ArrayList<Integer>[] graph=new ArrayList[n];

      for(int i=0;i<n;i++){
        graph[i]=new ArrayList<>();
      }  

      for(int[] edge:edges){
        int a=edge[0];
        int b=edge[1];

        graph[a].add(b);
        graph[b].add(a);
      }

      boolean[] visited=new boolean[n];

      Queue<Integer> q=new LinkedList<>();
      q.offer(source);
      visited[source]=true;
      while(!q.isEmpty()){
        int node=q.poll();

        if(node==destination){
            return true;
        }
        for(int next:graph[node]){
            if(!visited[next]){
                visited[next] = true;
                    q.offer(next);
            }
        }
      }
      return false;
    }
}