import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\nBEM-VINDO À CALCULADORA!\n");

        while (continuar) {
            Menu();
            int opcao = teclado.nextInt();

            if (opcao == 0) {
                System.out.println("Finalizando a calculadora...");
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Escolha 1, 2, 3 ou 4.\n");
                continue;
            }

            System.out.println("Digite o primeiro número: ");
            double num1 = teclado.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = teclado.nextDouble();

            Operacao(opcao, num1, num2);
        }

    }

    public static void Menu() {
        System.out.println("------CALCULADORA------");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void Operacao(int opcao, double num1, double num2) {
        double resultado = 0;
        String operacao = "";

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                operacao = " + ";
                break;
            case 2:
                resultado = num1 - num2;
                operacao = " - ";
                break;
            case 3:
                resultado = num1 * num2;
                operacao = " × ";
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divisão por zero não é permitida!\n");
                    return;
                }
                resultado = num1 / num2;
                operacao = " ÷ ";
                break;
        }

        System.out.println(num1 + operacao + num2 + " = " + resultado + "\n");
    }
}