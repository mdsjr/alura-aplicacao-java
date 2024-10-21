import java.util.Scanner;

public class NumeroPositoNegativo {

    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = banana.nextInt();

        if(numero >= 0) {
            System.out.println("Seu número é POSITIVO+");
        } else {
            System.out.println("Seu número é NEGATIVO-");
        }

    }

}
