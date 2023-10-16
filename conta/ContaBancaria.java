package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    // Getters
    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos
    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + ". Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("O valor de depósito é inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual: R$ " + this.saldo);
        }
    }
}
