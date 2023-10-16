package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos
    void imprimirDadosDaPessoa() {
        System.out.printf("%nNome: %s%nCPF: %s%nIdade: %s%n", this.getNome(), this.getCpf(), this.getIdade());
    }
}
