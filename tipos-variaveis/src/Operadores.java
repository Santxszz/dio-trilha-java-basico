public class Operadores {
    // ==  | igual
    // >   | maior
    // !=  | diferente
    // =   | atribui ou recebe
    // <   | menor
    // >=  | maior ou igual
    // <=  | menor ou igual
    // +   | soma
    // -   | subtração
    // *   | multiplicação
    // /   | divisão
    // %   | Módulo (resto)

    public static void main(String[] args) {
        String nome;
        nome = "Erek"; // Nome recebe "Erek"

        if(2 == 2) { // Verifica se o valor é igual a outro valor
            System.out.println("É Igual");
        }

        if(2 > 3) {} // Verifica se o numero é maior que o outro


        int numero = 5;
        int numeroTeste =5;
        System.out.println(- numero);

        numeroTeste = -numeroTeste;
        System.out.println(numeroTeste);

        System.out.println(numero);

        int incremento;
        incremento=+ 1;
        incremento++;
        System.out.println(incremento);

    }
}
