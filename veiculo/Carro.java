package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a classe Carro...");
    }

    @Override
    public void frear() {
        System.out.println("Freando a classe Carro...");
    }
}
