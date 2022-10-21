package les;

public class Lista implements Lab1.ILista {
    private int n;
    private int capacity;
    private int[] v;
    public Lista(int capacity){
        this.n = 0;
        this.capacity = capacity;
        this.v = new int[this.capacity];
    }

    public boolean insere(int valor){
        if (this.capacity == this.n)
            return false;

        this.v[this.n] = valor;
        this.n++;
        return true;
    }

    public boolean remove(int idx){
        if (idx < 0 || idx >= n)
            return false;

        for (int i = idx; i < n-1; i++) {
            v[i] = v[i+1];
        }
        n--;
        return true;
    }

    public int busca(int valor){
        for (int i = 0; i < n; i++) {
            if(v[i] == valor)
                return i;
        }

        return -1;
    }

    public void imprime(){
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }

}
