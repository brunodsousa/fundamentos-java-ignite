package pessoa;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescreveu
    void imprimirDadosDaPessoa() {
        super.imprimirDadosDaPessoa();
        System.out.printf("Salário: %s%n", this.getSalario());
    }

}
