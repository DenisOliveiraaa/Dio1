package contabanco;

public class ContaTerminal {
    private final String nomeCliente;
    private final String agencia;
    private final String numero;
    private double saldo;

    public ContaTerminal(String nomeCliente, String agencia, String numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

}

