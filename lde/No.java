package lde;

public class No {
    public int valor;
    public No proximo;
    public No(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor(){
        return valor;
    }

    public No getProximo(){
        return proximo;
    }
    //friend class
}
