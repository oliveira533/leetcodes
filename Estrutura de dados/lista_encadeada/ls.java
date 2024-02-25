public class ls {

    public static void main(String args[]){

        ListaLig lEstado = new ListaLig();
        lEstado.Adicionar("AC");
        lEstado.Adicionar("SP");
        lEstado.Adicionar("TO");
        System.out.println("Primeiro: " + lEstado.getPrimeiro().getValor());
        System.out.println("Segundo: " + lEstado.getPrimeiro().getProximo().getValor());
        System.out.println("Último: " + lEstado.getUltimo().getValor());
    }
}

// Classe que vai recber o elemento da lista encadeada
class Elemento{

    // Valor do elemento
    private String sValor;

    // Próximo valor
    private Elemento sProximo;

    public Elemento (String sNewValor){
        this.sValor = sNewValor;
    }

    public String getValor(){
        return sValor;
    }

    public void setValor(String sNewValor){
        this.sValor = sNewValor;
    }

    public Elemento getProximo(){
        return sProximo;
    }

    public void setProximo( Elemento sNewProximo){
        this.sProximo = sNewProximo;
    }
}

class ListaLig {
    private Elemento primeiro;
    private Elemento ultimo;
    private int nTamanho;

    public Elemento getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(Elemento eNewPrimeiro){
        this.primeiro = eNewPrimeiro;
    }

    public Elemento getUltimo(){
        return ultimo;
    }

    public void setUltimo(Elemento eNewUltimo){
        this.ultimo = eNewUltimo;
    }

    public int getTamanho(){
        return nTamanho;
    }

    public void setTamanho(int nNewTamanho){
        this.nTamanho = nNewTamanho;
    }

    public void Adicionar(String sNewValor){
        Elemento eNewElemento = new Elemento(sNewValor);
        if (this.primeiro == null && ultimo == null) {
            this.primeiro = eNewElemento;
            this.ultimo = eNewElemento;
            this.nTamanho++;
        }
        else{
            ultimo.setProximo(eNewElemento);;
            ultimo = eNewElemento;
        }

    }

    public void Remover(String sRemove){
        
    }

    public Elemento Pesquisar(String sValor){
        if (this.primeiro.getProximo() == null) {
            return this.ultimo;
        }
        else{
            
        }
        return null;
    }
}
