package lde;

public class LDE implements ILista{
    private No primeiro;
    private int n;
    public LDE(){
        primeiro = null;
        n = 0;
    }

    @Override
    public boolean insere(int valor){
        No temp = new No(valor);
        if(temp==null)
            return false;


        No anter = null;
        No atual = primeiro;
        while(atual != null && atual.valor < valor){
            anter = atual;
            atual = atual.proximo;
        }

        if(anter!=null)
            anter.proximo = temp;
        else
            primeiro = temp;

        temp.proximo = atual;
        n++;
        return true;
    }

    @Override
    public void imprime(){
        No temp = primeiro;
        while(temp != null){
            System.out.println(temp.valor);
            temp = temp.proximo;
        }
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
        if(anterior == null){
            primeiro = atual.proximo;
        } else if(i == idx){
            anterior.proximo = atual.proximo;
        }
        return true;
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

