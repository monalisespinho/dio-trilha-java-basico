import java.text.DecimalFormat;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Bem vindo ao Banco Java!");
        while (continuar) {
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[0] Encerrar");
            System.out.println("Escreva a operação que deseja fazer:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + df.format(saldo));
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque< saldo){
                        saldo -= saque;
                        System.out.println("Saque efetuado com sucesso!Saldo atual: " + df.format(saldo));
                    }else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual da conta: " + df.format(saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
