package les;

public class ListaOrdenada implements Lab1.ILista {
    private int[] v = null;
    private int n;
    private int capacidade;
    ListaOrdenada(int capacidade){
        this.capacidade = capacidade;
        this.n = 0;
        this.v = new int[capacidade];
    }

    public boolean insere(int valor){
        if (this.capacidade == this.n){
            return false;
        }
        int i;
        for(i = 0; i < n && this.v[i] <= valor ;i++); //achei onde uqero inserir

        int j;
        for(j = n-1; j >= i; j--){ //vou mover para inserir
            this.v[j+1] = this.v[j];
        }
        this.v[i] = valor;
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
        // Implementar BUSCA BINÁRIA
        int esq = 0;
        int dir = n-1;

        while (esq <= dir){
            int pivo = (esq + dir)/2;
            if (valor < v[pivo] ){
                dir = pivo - 1;
            }else if (valor > v[pivo]){
                esq = pivo + 1;
            }else{
                return pivo;
            }
        }

        return -1;
    }
    public void imprime(){
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }
}
