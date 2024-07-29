public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Monalise");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(200);
        cc.imprimirExtrato();
        cc.sacar(100);
        cc.tranferir(100, cp);
    }
}