package exercicios;

public class aprovacaoComFrequencia {
    public static void main(String[] args) {
        double nota1 = 6.78;
        double nota2 = 7.34;
        double frequencia = 74.45;
        
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            double media = (nota1 + nota2) / 2.0;   
            if (media >= 7 && frequencia >= 75) {
                String resultado = String.format("Aprovado com média: %.2f | Frequência: %.2f%%", media, frequencia);
                System.out.println(resultado);
            } else {
                System.out.printf("O aluno foi reprovado com média: %.2f e frequência: %.2f%%%n", media, frequencia);
            } 
        } else {
            System.out.println("Notas inválidas. Digite valores entre 0 e 10.");
        }
    }
}