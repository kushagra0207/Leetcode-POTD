1971. Find if Path Exists in Graph
Solved
Easy
Topics
Companies
There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

 

class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return  true;
        
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
         //construct graph, add bidirectional vertex
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
		//start dfs from start point
        dfs(graph,visited,start,end);
        return found;
    }
    
    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start] = true;
        //when we found and neighbour which is equal to end point inside the recursion, voooleeey! break and return the true
        for(int nei : graph.get(start)){
            if(nei == end){
                found = true;
                break;
            }
            if(!visited[nei])
                dfs(graph, visited, nei, end); //otherwise deep dig again!
        }
    }
}
