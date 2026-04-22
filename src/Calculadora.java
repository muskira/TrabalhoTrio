import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opcão abaixo para sua equação! \n");
            System.out.println("1 - soma");
            System.out.println("2 - subitração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("0 - sair \n");
            System.out.print("opcão:  ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro numero:  ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo numero:  ");
                double num2 = scanner.nextDouble();

                processarOperacoes(opcao, num1, num2);
            } else if (opcao != 0) {
                System.out.println("erro: opcao invalida ! tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }

    private static void processarOperacoes(int opcao, double num1, double num2) {
        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado da soma %.2f\n",resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado da subtração: %.2f\n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado da divisão: %.2f\n", resultado);
                } else {
                    System.out.println("Némero invalido!");

                }
        }
    }
}

    