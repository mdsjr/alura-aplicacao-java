import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----MENU-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círuclo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círuclo é: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
