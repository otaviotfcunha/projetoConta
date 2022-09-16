import java.util.Scanner;

public class ContaTeste {
    public static Conta minhaConta = new Conta();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int operacao;
        do{
            System.out.println("#######################################");
            System.out.println("Escolha uma opção para continuar...");
            System.out.println("1: Cadastrar conta");
            System.out.println("2: Mostrar dados da conta");
            System.out.println("3: Depositar um valor");
            System.out.println("4: Sacar um valor");
            System.out.println("0: Sair ");
            System.out.println("#######################################");
            operacao = sc.nextInt();
            sc.nextLine();
            switch (operacao) {
                case 1 -> {
                    execCadastrar();
                }
                case 2 -> {
                    execConsultar();
                }
                case 3 -> {
                    execDepositar();
                }
                case 4 -> {
                    execSacar();
                }
            }
        }while(operacao != 0);
    }

    private static void execCadastrar() {
        String a, b, c;
        double d;
        System.out.println("## Cadastrar os dados da conta ##");
        System.out.println("Digite o nome: ");
        a = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        b = sc.nextLine();
        System.out.println("Digite a agencia da conta: ");
        c = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        d = sc.nextDouble();
        minhaConta.salvaCliente(a, b, c, d);
    }
    private static void execConsultar(){
        System.out.println("## Dados da conta cadastrada ##");
        minhaConta.imprimir();
        System.out.println("#######################################");
        System.out.println("Aperte enter para continuar...");
        sc.nextLine();
    }
    private static void execDepositar(){
        double valor;
        System.out.println("## Depositar um valor na conta ##");
        System.out.println("Digite o valor a ser depositado: ");
        valor = sc.nextFloat();
        minhaConta.depositar(valor);
    }

    private static void execSacar(){
        double valor;
        System.out.println("## Sacar um valor da sua conta ##");
        minhaConta.imprimirSaldo();
        System.out.println("Digite o valor que deseja sacar: ");
        valor = sc.nextFloat();
        if(minhaConta.sacar(valor) == 1){
            System.out.println("Voce sacou o valor de R$ " + valor);
            System.out.println("#######################################");
        }else{
            System.out.println("Voce nao tem saldo suficiente para sacar o valor R$ " + valor);
            System.out.println("#######################################");
        }
        sc.nextLine();
        System.out.println("Aperte enter para continuar...");
        sc.nextLine();
    }




}
