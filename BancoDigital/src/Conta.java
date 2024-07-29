public abstract class Conta implements IConta{
    private static  int SEQUENCIAL = 1;
    protected static  final int AGENCIA_PADRAO = 1;
    protected   int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente  = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public  void imprimirExtrato(){

    }
    @Override
    public void sacar(double valor) {
        if (valor<= saldo){
            saldo -=valor;
            System.out.println("Saldo atual " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        if(valor<=saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("Saldo insuficiente para transferência");
        }
    }
    protected void imprimirInfo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agêcia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
