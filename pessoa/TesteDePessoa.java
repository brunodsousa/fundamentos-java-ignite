package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Bruno", 28, "12312312345");

        System.out.println(pessoa1.getNome());

        Pessoa pessoa2 = new Pessoa("Taiãma", 31, "32132132165");

        System.out.println(pessoa2.getNome());

        pessoa1.imprimirDadosDaPessoa();

        Professor professor1 = new Professor("José", 50, "12312312312", 5000);
        professor1.imprimirDadosDaPessoa();

        Aluno aluno1 = new Aluno("Didi", 1, "32132132132", "D1D1S0US4");
        aluno1.imprimirDadosDaPessoa();
    }
}
