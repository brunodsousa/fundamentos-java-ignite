package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a classe Moto...");
    }

    @Override
    public void frear() {
        System.out.println("Freando a classe Moto...");
    }
}
