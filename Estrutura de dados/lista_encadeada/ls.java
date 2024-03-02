public class ls {

    public static void main(String args[]){

        ListaLig lEstado = new ListaLig();
        lEstado.Adicionar("AC");
        lEstado.Adicionar("SP");
        lEstado.Adicionar("TO");
        System.out.println("Primeiro: " + lEstado.getPrimeiro().getValor());
        System.out.println("Segundo: " + lEstado.getPrimeiro().getProximo().getValor());
        System.out.println("Último: " + lEstado.getUltimo().getValor());
        System.out.println("Pesquisa: " + lEstado.get(0));
        lEstado.Remover("SP");
        System.out.println("Primeiro: " + lEstado.getPrimeiro().getValor());
        System.out.println("Segundo: " + lEstado.getPrimeiro().getProximo().getValor());
        System.out.println("Último: " + lEstado.getUltimo().getValor());
    }
}

// Classe que vai recber o elemento da lista encadeada
class Elemento{

    // Valor do elemento
    private String sValor;

    // Próximo valor da lista
    private Elemento sProximo;

    // Metodo para criar novo valor
    public Elemento (String sNewValor){
        this.sValor = sNewValor;
    }

    // Pegar o valor de um elemento
    public String getValor(){
        return sValor;
    }

    // Definir o valor de um elemento
    public void setValor(String sNewValor){
        this.sValor = sNewValor;
    }

    // Pegar o próximo valor de um elemento
    public Elemento getProximo(){
        return sProximo;
    }

    // Definir o próximo elemento na lista
    public void setProximo( Elemento sNewProximo){
        this.sProximo = sNewProximo;
    }
}

// Classe da lista ligada
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
            this.ultimo.setProximo(eNewElemento);
            this.ultimo = eNewElemento;
        }
        this.nTamanho++;

    }

    public void Remover(String sRemove){
        Elemento eAnterior = null;
        Elemento eAtual = this.primeiro;
        System.out.println(eAtual.getValor());
        System.out.println(sRemove);
        for(int i = 0; i < this.nTamanho; i++){
            if(eAtual.getValor().equalsIgnoreCase(sRemove)) {
                if (eAtual == this.primeiro) {
                    this.primeiro = eAtual.getProximo();
                    eAtual.setProximo(null);
                } else if (eAnterior == this.ultimo) {
                    this.ultimo = eAnterior;
                    this.ultimo.setProximo(null);
                } else{
                    eAnterior.setProximo(eAtual.getProximo());
                    eAtual= null;
                }
                nTamanho--;
                break;
            }
            eAnterior = eAtual;
            eAtual = eAtual.getProximo();
        }
    }

    public Elemento get(int posicao){
        Elemento eAtual = this.primeiro;
        for(int i=0; i< posicao; i++){
            if (eAtual.getProximo()!=null) {
                eAtual= eAtual.getProximo();
            }
        };

        return eAtual;
    }
}
