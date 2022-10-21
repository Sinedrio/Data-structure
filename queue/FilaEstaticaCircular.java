package queue;

public class FilaEstaticaCircular {
    int[] v;
    int i=0;
    int f=0;
    int n=0;
    int cap;
    public FilaEstaticaCircular(int Capacidade) {
        cap = Capacidade+1; //Sentinela
        v = new int[cap];
    }

    public boolean enfileira(int valor) {
        while(i != cap ) {
            if (cap < v.length) {
                v[cap] = valor;
                cap ++;
                i++;
            }
        }
        return true;
    }

    public int desenfileira() throws FilaVaziaException {
        if (i==f)
            throw new FilaVaziaException();


        return 0;
    }

    public int capacidade() {
        return cap;
    }

    public int tamanho() {
        return n;
    }

}
