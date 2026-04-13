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
        return 0; 
    }

    public void union(int i, int j) {
    }
}