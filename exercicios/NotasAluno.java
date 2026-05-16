package exercicios;

public class NotasAluno {
    public static void main(String[] args) {
        double nota1 = 11.78;
        double nota2 = 13.34;
        
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            double media = (nota1 + nota2) / 2;   
            if (media >= 6) {
                System.out.printf("O aluno foi aprovado com: %.2f", media);
            } else {
                System.out.printf("O aluno foi reprovado com: %.2f", media );
            }
        } else {
        System.out.println("Notas inválidas. Digite valores entre 0 e 10.");
        }

    }
}
