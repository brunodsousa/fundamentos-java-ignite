package excecoes;

public class Excecoes {

    // Checked exceptions: aquelas que o compilador do Java exige que sejam
    // tratadas; previstas

    // Unchecked exceptions: não previstas, o compilador não consegue saber que terá
    // o erro; só em tempo de execução

    public static void main(String[] args) {
        // try / catch
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu ruim.");
            e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
