package lde;

public class LDEMain {
    public static void main(String[] args) {
        //Não alterar o main
        LDE l = new LDE();
        l.insere(1);
        l.insere(5);
        l.insere(3);
        l.insere(9);
        l.insere(2);
        l.insere(0);
        System.out.println("===================");
        l.imprime();
        l.remove(3);
        System.out.println("===================");
        l.imprime();
        l.remove(0);
        System.out.println("===================");
        l.imprime();
        l.remove(3);
        System.out.println("===================");
        l.imprime();
        l.insere(9);
        System.out.println("===================");
        l.imprime();
        System.out.println("Buscas:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + l.busca(i));
        }


    }
}
