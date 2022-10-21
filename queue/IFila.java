package queue;

public interface IFila {
    public boolean enfileira(int valor);
    public int desenfileira() throws FilaVaziaException;
    public int capacidade();
    public int tamanho();
}
