import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ContaTerminal {
    private String nomeCliente;
    private int agencia;
    private int numeroConta;
    private double saldo;


    public ContaTerminal(String nomeCliente, int agencia, int numeroConta){
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void imprimirInfo() {
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
