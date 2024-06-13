
public class DepthFirstSearchRecursion {

    public void dfs(Vertex root){
        System.out.println("Vertex " + root.getName() + " traversed by DFS algorithm.");
        for(Vertex v : root.getNeighbours()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfs(v);
            }
        }
    }

}








