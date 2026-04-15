package main;

import kruskal.Edge;
import kruskal.Kruskal;

public class Main {
    public static void main(String[] args) {
        int n = 4; 
        
        
        Edge[] arestas = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        
        Kruskal.executarKruskal(n, arestas);
    }
}