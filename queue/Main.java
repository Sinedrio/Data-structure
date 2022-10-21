package queue;

public class Main {
    public static void main(String args[]) throws FilaVaziaException{
        IFila f = new FilaEstaticaCircular(10);
        f.enfileira(1);
        f.enfileira(2);
        f.enfileira(3);
        System.out.println(f.desenfileira());
        System.out.println(f.desenfileira());
        System.out.println(f.tamanho());
        f.enfileira(4);
        f.enfileira(5);
        f.enfileira(6);
        System.out.println(f.tamanho());
        f.enfileira(7);
        System.out.println(f.desenfileira());
        System.out.println(f.tamanho());
        f.enfileira(8);
        f.enfileira(9);
        System.out.println(f.desenfileira());
        f.enfileira(10);
        System.out.println(f.tamanho());

        while(f.tamanho()>0){
            System.out.println(f.desenfileira());
        }
    }
}
