package stack;

class No{
    //Não alterar essa classe
    public int valor;
    public No proximo;

    public No(int valor){
        this.valor = valor;
        this.proximo = null;
        System.out.println("No " + valor + " criado");
    }
}
interface IPilha{
    boolean insere(int valor);
    int remove();
    void imprime();
}

class PilhaEncadeada implements IPilha{
    private No topo;

    public PilhaEncadeada(){
        topo = null;
    }

    @Override
    public boolean insere(int valor) {
        No no = new No(valor);
        no.valor = valor;
        no.proximo = topo;
        topo = no;

        return true;
    }

    @Override
    public int remove() {
        int valor = topo.valor;
        topo = topo.proximo;

        return valor;
    }

    @Override
    public void imprime() {
        No c = topo;
        while(c != null){
            System.out.println(c);
            c = c.proximo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IPilha p = new PilhaEncadeada();
        p.insere(10);
        p.insere(30);
        p.insere(20);
        p.insere(1);
        System.out.println(p.remove());
        System.out.println(p.remove());
        p.insere(99);
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());
    }
}


