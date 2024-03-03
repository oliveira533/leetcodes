public class st {
    public static void main(String args[]){
        Pilha pessoas = new Pilha();
        pessoas.setTamanho(5);
        pessoas.push("Gustavo");
        pessoas.push("Malu");
        pessoas.push("Pri");

        System.out.println(pessoas.getUltimo().getValor());
        System.out.println(pessoas.getCapacidade());
        System.out.println(pessoas.getTamanho());

        pessoas.pop();
        System.out.println(pessoas.getUltimo().getValor());
        System.out.println(pessoas.getCapacidade());
        System.out.println(pessoas.getTamanho());
    }
}

class Elemento {
    private String valor;

    private Elemento anterior;

    public Elemento (String sValor){
        this.valor = sValor;
    }

    public void setValor(String sValor){
        this.valor = sValor;
    }

    public String getValor(){
        return this.valor;
    }

    public void setAnterior(Elemento eValor){
        this.anterior = eValor;
    }

    public Elemento getAnterior(){
        return this.anterior;
    }
}

class Pilha{
    private Elemento ultimo;

    private int tamanho;

    private int capacidade;

    public void setUltimo(Elemento eValor){
        this.ultimo = eValor;
    }

    public Elemento getUltimo(){
        return this.ultimo;
    }

    public void setTamanho(int nValor){
        this.setCapacidade(0);
        this.tamanho = nValor;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    private void setCapacidade(int nValor){
        this.capacidade = nValor;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public void push( String sValor){
        String erro = "Excedeu a capacidade";
        Elemento newElemento = new Elemento(sValor);

        if (this.capacidade <= this.tamanho) {
            if (this.ultimo == null) {
                this.setUltimo(newElemento);
            }
            else{
                newElemento.setAnterior(this.ultimo);
                this.setUltimo(newElemento);
            }
            this.capacidade++;
        }
        else{
            System.out.println(erro);
        }
    }

    public void pop(){
        Elemento ePenultimo = this.ultimo.getAnterior();
        if(this.capacidade == 0){
            System.out.println("Não é possível remover valor");
        }
        else if (this.capacidade == 1) {
            this.ultimo = null;
        }
        else{
            this.ultimo = ePenultimo;
        }
        this.capacidade--;
    }
}