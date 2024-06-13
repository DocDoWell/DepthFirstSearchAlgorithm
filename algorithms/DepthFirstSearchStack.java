import java.util.ArrayDeque;
import java.util.Deque;

public class DepthFirstSearchStack {

    private Deque<Vertex> stack;

    public DepthFirstSearchStack() {
        this.stack =  new ArrayDeque<>();
    }

    public void dfs(Vertex root){

        stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actual = stack.pop();
            System.out.println("Vertex " + actual.getName() + " traversed by BFS algorithm.");

            for(Vertex v : actual.getNeighbours()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }
}
