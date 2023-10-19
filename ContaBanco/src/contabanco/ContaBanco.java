package contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o numero da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(nome, agencia, numero, saldo);

        System.out.println("Ola " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agencia e " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() + " ja esta disponivel para saque.");
    
    }
    
}
