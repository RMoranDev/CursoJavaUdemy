package arrays;
    
public class Somatorio {
    
    public static void main(String[] args) {
        // Cria um array com 1000 posições
        int[] numeros = new int[1000];

        int soma1 = 0;
        // Preenche o array com valores de 1 até 1000
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            soma1 += numeros[i];
        }

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // 5. Imprimir o valor final da soma
        System.out.println("A soma dos números de 1 até 1000 é: " + soma1);
    }
}