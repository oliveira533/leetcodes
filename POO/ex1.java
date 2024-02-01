import java.util.Date;
import java.util.Scanner;

public class ex1{ 
    public static void main(String args[]){

        Carro carro1 = new Carro();
        carro1.setModelo("Gol");
        carro1.setPlaca("EXB-1F48");
        carro1.setChassi("FHSALKJFHDSLKJHHA");
        carro1.setCor("Preto");
        carro1.setMontadora("Volkswagem");

        carro1.mostrar();

        System.out.print("\n");

        Carro carro2 = new Carro();
        carro2.setModelo("T-CROSS");
        carro2.setPlaca("CUF-OF0");
        carro2.setChassi("FHSALKJFHDSLKJHHA");
        carro2.setCor("Cinza");
        carro2.setMontadora("Volkswagem");
        carro2.setKm(45);

        carro2.mostrar();
    }
}

class Carro{
    private String modelo;
    private String placa;
    private String chassi;
    private String cor;
    private String montadora;
    private int km = 0;

    public void mostrar(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Cor: " + cor);
        System.out.println("Montadora: " + montadora);
        System.out.println("Km: "+ km);
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getKm(){
        return km;
    }

    public void setKm(int km){
        this.km = km;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getChassi(){
        return chassi;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getMontadora(){
        return montadora;
    }

    public void setMontadora(String montadora){
        this.montadora = montadora;
    }
}