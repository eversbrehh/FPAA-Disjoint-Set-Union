package main;

import kruskal.Edge;
import kruskal.Kruskal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] n_valores = {1000, 5000, 10000, 20000, 50000};
        
        System.out.println(" Iniciando Testes de Desempenho (NaiveDSU)");
        System.out.println("Avaliando tempo de resposta por volume de dados...\n");

        for (int n : n_valores) {
            int m = n * 5; 
            Edge[] arestas = gerarDados(n, m);

            System.out.print("Vértices: " + n + " | Arestas: " + m + " -> ");
            long start = System.currentTimeMillis();
            Kruskal.executarKruskal(n, arestas);
            long end = System.currentTimeMillis();
            long tempoTotal = end - start;

            System.out.println("Concluído em: " + tempoTotal + "ms");
        }
        System.out.println("\n Testes finalizados com sucesso");
    }

    private static Edge[] gerarDados(int n, int m) {
        Random r = new Random(); 
        Edge[] listaArestas = new Edge[m];
        
        for (int i = 0; i < m; i++) {
            int u = r.nextInt(n);
            int v = r.nextInt(n);
            int p = r.nextInt(100) + 1; 
            listaArestas[i] = new Edge(u, v, p);
        }
        return listaArestas;
    }
}