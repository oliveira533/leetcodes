// Importando o scanner
import java.util.Scanner;

public class bs{ 
    // Funão principal
    public static void main(String args[]){

        // Array que vou procurar
        int nArray[] = {1, 15, 27, 32, 45, 89, 100, 110, 35069};

        // Variável que vai receber o valor que buscado 
        int nBusca;
        
        // Variável de scanner
        Scanner ler = new Scanner(System.in);

        // Recebendo o valor que vou buscar
        System.out.print("Informe o valor que procura: ");
        nBusca = ler.nextInt();

        // Chamando a função que faz a busca binária. A função recebe o array e o valor que vou buscar
        fnMeio(nArray, nBusca);
    }

    public static void fnMeio(int aArray[],int nProcura){
        // Variável que receber a menor posição do array
        int nMenor = 0;

        // Variável que vai reber a maior posição do array
        int nMaior = aArray.length -1;

        // Variável que vai receber a posição do meio na busca
        int nMeio;

        // Variável que vai receber o valor de chute pra verificar se é o valor que procuro
        int nChute;

        // Variável de incremento que conta as tentativas
        int i = 1;

        // Laço que vai fazer a busca
        while (nMenor <= nMaior) {
            // Definindo o valor do meio sendo ele a soma da maior posição com a menor dividida por 2.
            // Para isso pegamos o valor inteiro 
            nMeio = (nMaior + nMenor) / 2;

            // O chute vai receber o valor do meio do array
            nChute = aArray[nMeio];

            // Verificando se o chute está certo
            if(nChute == nProcura){
                System.out.println("Achei na tentativa "+ i);
                break;
            }
            // Verificando se o chute é maior 
            if(nChute > nProcura){
                // Se o chute for menor, diminui o valor da maior posição
                nMaior = nMaior - 1;
            }
            // Verificando se o chute pe menor
            if(nChute < nProcura){
                // Se o chute for menor, aumenta o valor da menor posição 
                nMenor = nMenor + 1;
            }
            i +=1;
        }

    }
}