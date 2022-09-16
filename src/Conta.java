public class Conta {
    private String numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta() {
        this.numeroConta = " ";
        this.agencia = " ";
        this.nomeCliente = " ";
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    int sacar(double qtd) {
        int sucesso = 0;
        qtd = Math.abs(qtd);
        if (this.saldo < qtd)
            sucesso = 0;
        else {
            this.saldo -= qtd;
            sucesso = 1;
        }
        return sucesso;
    }
    void depositar(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }
    void salvaCliente(String nom, String num, String ag, double sal){
        this.nomeCliente = nom;
        this.numeroConta = num;
        this.agencia = ag;
        this.saldo = sal;
    }
    void imprimir(){
        System.out.println("Dono da Conta: " + this.getNomeCliente());
        System.out.println("Numero da Conta: " + this.getNumeroConta());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    void imprimirSaldo(){
        System.out.println("Seu saldo atual: " + this.getSaldo());

    }
}
