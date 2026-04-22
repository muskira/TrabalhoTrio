import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite abaixo o valor que deseja sacar: ");
        System.out.print("R$ ");

        int valorSaque = leitor.nextInt();
        int restante = valorSaque;

        int[] notasDisponiveis = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("\nPara o saque de R$ " + valorSaque + ", você receberá:");

        for (int nota : notasDisponiveis) {

            int quantidadeNotas = restante / nota;

            if (quantidadeNotas > 0) {
        System.out.println(quantidadeNotas + " nota(s) de R$ " + nota);

            restante = restante % nota;
        }
    }
        System.out.println("-------------------------------------");
        leitor.close();
    }
}