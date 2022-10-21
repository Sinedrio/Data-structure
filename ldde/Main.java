package ldde;

public class Main {
    public static void imprime(ILista l, String titulo) {
        System.out.println("==" + titulo + "==");
        l.imprime();
        System.out.println("=====Reverso====");
        l.imprimeReverso();
        System.out.println("======FIM=======");
    }

    public static void main(String[] args) {
        ILista l = new Ldde();
        l.insere(20);
        l.insere(10);
        l.insere(5);
        l.insere(35);
        l.insere(200);
        imprime(l, "Após Inserções");

        l.remove(3);
        imprime(l, "Após Remove indice 3");

        l.remove(l.busca(10));
        imprime(l, "Após Remove número 10");

        while (l.remove(0)) ;

        imprime(l, "Após Remover todos");

    }
}
