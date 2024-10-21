import java.util.Scanner;
// Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = leitura.nextInt();

        int comparacao = Integer.compare(numero1, numero2);

        switch (comparacao) {
            case -1:
                System.out.println("O 2º número é maior.");
                break;
            case 0:
                System.out.println("Os dois números são iguais.");
                break;
            case 1:
                System.out.println("O 1º número é maior.");
                break;
        }


    }
}
