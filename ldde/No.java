package ldde;

public class No {
    public int valor;
    public No anterior;
    public No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}
