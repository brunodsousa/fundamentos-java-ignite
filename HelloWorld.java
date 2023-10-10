/*
 * HelloWorld = nome da classe
 * public = tipo de acesso da classe
 * class = tipo da classe
 * 
 * O nome da classe deve ser o mesmo do nome do arquivo, com extensão .java
 * O escopo da classe começa quando abrimos chave e termina quando a fechamos
 */
public class HelloWorld {
    // Todo conteúdo deverá ser inserido aqui dentro.
    public static void main(String[] args) {
        /*
         * public = modificador de acesso que indica que o método poderá ser acessado de
         * qualquer lugar no programa
         * static = indica que o método main pertence a essa classe (HelloWorld) e não a
         * uma instância específica
         * void = tipo de retorno que o método vai ter
         * main = nome do método; esse método precisa necessariamente chamar main, pois
         * é definido pelo Java como o ponto inicial/de partida do programa
         * String[] args = tipo do conteúdo que será passado como argumento para o
         * método
         * 
         * Uma aplicação precisa ter, obrigatoriamente, o método main.
         */

        /*
         * Tipos de Dados
         * Números (int, double, float, long)
         * Texto (String)
         * Booleano (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 98498446545465421L;
        String dadoDoTipoString = "Bruno";
        boolean dadoDoTipoBoolean = false;

        // If-Else
        if (dadoDoTipoInt == 10) {
            // sysout
            System.out.println("Entrou no if...");
        } else if (dadoDoTipoInt == 12) {
            System.out.println("Entrou no else if...");
        } else {
            System.out.println("Entrou no else...");
        }

        // While (enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3.");
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("Saiu do while...");

        // For
        System.out.println("Iniciando o For...");
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o For...");
    }
}
// Fora do escopo da classe