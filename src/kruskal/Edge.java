package kruskal;

public class Edge implements Comparable<Edge> {
    public int origem;
    public int destino;
    public int peso;

    public Edge(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int compareTo(Edge outra) {
       return this.peso - outra.peso;

        
    }
}