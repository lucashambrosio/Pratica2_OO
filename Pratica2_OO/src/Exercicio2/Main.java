package Exercicio2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de rendimento mensal: ");
        double taxaRendimento = scanner.nextDouble();

        System.out.print("Informe o número de meses: ");
        int numMeses = scanner.nextInt();

        Rendimento rendimento = new Rendimento(investimentoInicial, taxaRendimento, numMeses);
        double resultado = rendimento.calcularRendimento();
        System.out.println("O rendimento total do investimento é de: " + resultado);

        scanner.close();
    }

}
