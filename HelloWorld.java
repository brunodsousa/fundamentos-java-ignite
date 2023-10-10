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
        System.out.println("Hello, Java!");
    }
}
// Fora do escopo da classe