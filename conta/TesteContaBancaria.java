package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("1234", "José");

        contaBancaria1.depositar(150);
        contaBancaria1.sacar(100);
    }
}
