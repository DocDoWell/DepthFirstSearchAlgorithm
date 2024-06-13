package main
public class App {

    public static void main(String[] args){
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        a.addNeighbour(b);
        a.addNeighbour(c);
        c.addNeighbour(d);
        c.addNeighbour(e);

        DepthFirstSearchRecursion dfsRecursion = new DepthFirstSearchRecursion();
        dfsRecursion.dfs(a);

        System.out.println("--------------------------------");

        a.setVisited(false);
        b.setVisited(false);
        c.setVisited(false);
        d.setVisited(false);
        e.setVisited(false);

        DepthFirstSearchStack dfsStack = new DepthFirstSearchStack();
        dfsStack.dfs(a);
    }


}