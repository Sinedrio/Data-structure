package les;

public class Lab1 {
    /**
     * @author      : lopespt (lopespt@$HOSTNAME)
     * @file        : main
     * @created     : quarta set 01, 2021 21:38:51 -03
     */

    interface ILista{
        public boolean insere(int valor);
        public boolean remove(int idx);
        public int busca(int valor);
        public void imprime();
    }
        public static void testa(ILista lista){
            System.out.println("Iniciando teste: ");
            int v[] = {6,3,8,6,4,2,8,0,1};

            for (int i : v) {
                lista.insere(i);
            }
            lista.imprime();
            System.out.println("======");
            lista.remove(3);
            lista.remove(0);
            lista.remove(lista.busca(8));
            lista.imprime();
            System.out.println("Fim do teste: ");
        }

        public static void main(String[] args) {
            testa(new Lista(10));
            testa(new ListaOrdenada(10));
            testa(new Lista(5));
            testa(new ListaOrdenada(5));
        }
    }
