package kruskal;

import java.util.Arrays;
import dsu.NaiveDSU;

public class Kruskal {
    
    public static void executarKruskal(int n, Edge[] arestas) {
        
        Arrays.sort(arestas);
        NaiveDSU dsu = new NaiveDSU(n);
        int custoTotalMST = 0; 
        
        System.out.println("Construindo a MST com Naive DSU");

        for (int i = 0; i < arestas.length; i++) {
            Edge arestaAtual = arestas[i];
            
            
            int raizOrigem = dsu.find(arestaAtual.origem);
            int raizDestino = dsu.find(arestaAtual.destino);
            
            if (raizOrigem != raizDestino) { 
                custoTotalMST += arestaAtual.peso; 
                dsu.union(arestaAtual.origem, arestaAtual.destino); 
                System.out.println("Aresta adicionada: " + arestaAtual.origem + " -- " + arestaAtual.destino + " (Peso: " + arestaAtual.peso + ")");
            }
        }

        System.out.println("Custo total da Árvore Geradora Mínima: " + custoTotalMST);
    }
}