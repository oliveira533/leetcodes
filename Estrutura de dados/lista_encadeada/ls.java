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
    // Primeiro elemento da lista
    private Elemento primeiro;

    // Último elemento da lista
    private Elemento ultimo;

    // Tamanho da Lista
    private int nTamanho;

    // Método para pegar o primeiro elemento
    public Elemento getPrimeiro(){
        return primeiro;
    }

    // Método para definir o primeiro elemento
    public void setPrimeiro(Elemento eNewPrimeiro){
        this.primeiro = eNewPrimeiro;
    }

    // Método para pegar o último elemento
    public Elemento getUltimo(){
        return ultimo;
    }

    // Método para definir o último elemento
    public void setUltimo(Elemento eNewUltimo){
        this.ultimo = eNewUltimo;
    }

    // Método para pegar o tamanho da lista
    public int getTamanho(){
        return nTamanho;
    }

    // Método para definir o tamanho da lista
    public void setTamanho(int nNewTamanho){
        this.nTamanho = nNewTamanho;
    }

    // Método para adicionar um valor a lista
    public void Adicionar(String sNewValor){
        // Criando uma nova variável do tipo elemento e definindo o valor dele
        Elemento eNewElemento = new Elemento(sNewValor);

        // Verificando se o primeiro valor é nulo e o primeiro valor é nulo
        if (this.primeiro == null && ultimo == null) {

            // Se for nulo eu defino o novo elemento como primeiro e último
            this.primeiro = eNewElemento;
            this.ultimo = eNewElemento;

            // Aumentando o tamanho da lista
            this.nTamanho++;
        }
        else{

            // Caso não seja nulo eu vou colocar ele como o próximo valor último
            this.ultimo.setProximo(eNewElemento);

            // E transformo o novo elemento no último elemento
            this.ultimo = eNewElemento;
        }

        // Por fim aumento o tamanho da lista
        this.nTamanho++;

    }

    // Método de remover elemento 
    public void Remover(String sRemove){

        // Criando uma variável que vai receber o elemento anterioro ao que vou excluir
        Elemento eAnterior = null;

        // Criando uma variável que vai percorrer a lista para saber onde estou
        Elemento eAtual = this.primeiro;

        // Laço que vai percorrer a lista 
        for(int i = 0; i < this.nTamanho; i++){

            // Verificando se a posição na lista é igual ao valor que eu quero remover
            if(eAtual.getValor().equalsIgnoreCase(sRemove)) {

                // Verificando se é o primeiro valor da lista
                if (eAtual == this.primeiro) {

                    // Transformando a segunda posição no primeiro
                    this.primeiro = eAtual.getProximo();

                    // Definindo o primeiro como nulo
                    eAtual.setProximo(null);

                // Verificando se é a última posição
                } else if (eAnterior == this.ultimo) {
                    // Tornando o anterior em último
                    this.ultimo = eAnterior;

                    // Definindo o último como nulo
                    this.ultimo.setProximo(null);

                // Se não for nenhum dos casos 
                } else{

                    // Apenas torno nulo os valores
                    eAnterior.setProximo(eAtual.getProximo());
                    eAtual= null;
                }

                // Diminuindo o tamanho
                nTamanho--;
                break;
            }

            // Movendo o anterior na lista e movendo o atual na lista
            eAnterior = eAtual;
            eAtual = eAtual.getProximo();
        }
    }

    // Metódo para pegar um elemento
    public Elemento get(int posicao){

        // Definindo o elemento que vai percorrer a lista
        Elemento eAtual = this.primeiro;

        // O laço que vai percorrer a lista
        for(int i=0; i< posicao; i++){
            if (eAtual.getProximo()!=null) {
                eAtual= eAtual.getProximo();
            }
        };

        // Retornando o elemento na posição solicitada
        return eAtual;
    }
}
