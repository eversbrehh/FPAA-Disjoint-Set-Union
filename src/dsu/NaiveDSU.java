package dsu;

public class NaiveDSU {
    private int[] pai;

    public NaiveDSU(int n) {
        pai = new int[n];
        for (int i = 0; i < n; i++){
            pai [i] = i;
        }

    }

    public int find(int i) {
    while ( pai[i] != i){
        i= pai[i];
    }
        return i; 
    }

    public void union(int i, int j) {
        int paiI = find(i);
        int paiJ = find(j);
        if (paiI != paiJ){
            pai[paiI] = paiJ;
        }



    }
}