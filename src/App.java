import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        // João Papo-de-Pescador homem de bem comprou um microcomputador para controlar  
        // o rendimento diário de seu trabalho
        // Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do Estado de São Paulo (50 quilos)
        // deve pagar uma multa de R$ 4,00 por quilo excedente
        // João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso
        // Gravar na variável excesso da quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
        // Imprima os dados do programa com as mensagens adequadas.
        double pesoDePeixes, multa, excesso; 

        System.out.println("Informe o peso dos seus peixes em Kg: ");
        Scanner teclado = new Scanner(System.in); 
        pesoDePeixes = teclado.nextDouble(); 

        if ((pesoDePeixes > 50)) {
            excesso = pesoDePeixes - 50; 
            multa = excesso * 4; 
            System.out.println("Seus peixes excederam em: " + excesso + "Kg ");
            System.out.println("O valor da multa é R$ " + multa);
            
        }else{
            System.out.println("Não houve excesso de peso. ");
        }
        
    }
}
