package graph;

import java.util.HashSet;
import java.util.Set;
public class Vertex {
    private String name;
    private boolean visited;
    private Set<Vertex> neighbours;

    public Vertex(String name){
        this.name = name;
        this.neighbours = new HashSet<>();
    }

    public Set<Vertex> getNeighbours(){
        return this.neighbours;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void addNeighbour(Vertex vertex){
        this.neighbours.add(vertex);
    }

    public String toString(){
        return this.name;
    }
}



