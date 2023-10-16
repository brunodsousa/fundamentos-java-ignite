package pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescreveu
    void imprimirDadosDaPessoa() {
        super.imprimirDadosDaPessoa();
        System.out.printf("Matrícula: %s%n", this.getMatricula());
    }
}
