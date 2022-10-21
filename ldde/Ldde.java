package ldde;

class Ldde implements ILista {
    private No primeiro = null;
    private No ultimo = null;
    private int n = 0;

    @Override
    public boolean insere(int valor) {

        No novo = new No(valor);
        if(novo==null)
            return false;


        No anter = null;
        No atual = primeiro;
        while(atual != null && atual.valor < valor){
            anter = atual;
            atual = atual.proximo;
        }

        if(anter!=null)
            anter.proximo = novo;
        else
            primeiro = novo;


        novo.anterior = anter;
        novo.proximo = atual;

        if (atual!= null){
            atual.anterior = novo;
        } else{
            ultimo = novo;
        }
        n++;

        return true;
    }

    @Override
    public boolean remove(int idx) {

        No atual = this.primeiro;
        No anterior = null;
        int i;
        for(i = 0; atual != null && i != idx; i++ ){
            anterior = atual;
            atual = atual.proximo;
        }
        if (atual == null) {
            return false;
        }

        No proximo = atual.proximo;
        if(anterior != null){
            anterior.proximo = proximo;
        } else{
            primeiro = proximo;
        }
        if (proximo != null){
            proximo.anterior = anterior;
        } else{
            ultimo = anterior;
        }

        return true;
    }

    @Override
    public void imprime() {
        No atual = primeiro;
        while(atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    @Override
    public void imprimeReverso() {
        No atual = ultimo;
        while(atual != null) {
            System.out.println(atual.valor);
            atual = atual.anterior;
        }
    }

    @Override
    public int busca(int valor) {

        No atual = this.primeiro;
        

        for(int index = 0; atual != null; index ++ ){
            if(valor == atual.valor) {
                return index;
            } else {
                atual = atual.proximo;
            }
        }

        return -1;
    }


}
