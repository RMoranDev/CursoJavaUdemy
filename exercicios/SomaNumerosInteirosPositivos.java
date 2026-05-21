package exercicios;

public class SomaNumerosInteirosPositivos {
    public static void main(String[] args) {
        
        int numero = 10;
        int soma = 0;

        do {
            soma += numero; // adiciona o valor do contador à soma
            numero--;       // incrementa o contador
        } while (numero > 0);

        // Exibe o resultado
        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);

    }
}
