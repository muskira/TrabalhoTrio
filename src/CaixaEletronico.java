import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor que deseja sacar: ");
        int amount = scanner.nextInt();

        int[] NotasUsadas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Notas usadas:");

        for (int NotasUsada : NotasUsadas) {
            int count = amount / NotasUsada; // how many of this bill Quantas nostas faltam
            amount = amount % NotasUsada;    // remaining amount Valor retante

            if (count > 0) {
                System.out.println(NotasUsada + ": " + count);
            }
        }
        scanner.close();
    }
}