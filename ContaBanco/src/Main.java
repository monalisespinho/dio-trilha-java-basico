import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema da Conta Bancária");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o valor a depositar: ");
        double valorDeposito = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(nome, agencia, numeroConta);
        conta.depositar(valorDeposito);

        System.out.println("\nInformações da Conta Bancária:");
        conta.imprimirInfo();

        scanner.close();

    }
}