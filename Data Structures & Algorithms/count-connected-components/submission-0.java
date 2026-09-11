class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        int componet = 0;

        for(int node = 0; n > node; node++){
            if(!visited[node]){
                componet++;
                dfs(node, graph, visited);
            }
        }
        return componet;
    }
    private void dfs(int node, List<List<Integer>> graph, boolean[] visited){
        visited[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, graph, visited);
            }
        }
    }
}
