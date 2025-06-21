import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        final double INFLACAO = 3.8;

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;

        if (salarioAtual <= 280.00) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15.0;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        double aumentoReal = (valorAumento / salarioAtual * 100) - INFLACAO;
        double valorAumentoReal = salarioAtual * (aumentoReal / 100);

        System.out.println("\nDetalhes do reajuste salarial:");
        System.out.println("1. Salário antes do reajuste: R$ " + df.format(salarioAtual));
        System.out.println("2. Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("3. Valor do aumento: R$ " + df.format(valorAumento));
        System.out.println("4. Novo salário após o aumento: R$ " + df.format(novoSalario));
        System.out.println("5. Valor do aumento real (descontada a inflação): R$ " + df.format(valorAumentoReal));

        scanner.close();
    }
}
