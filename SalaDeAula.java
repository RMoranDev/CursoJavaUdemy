public class SalaDeAula {
    static int totalAlunos = 0;

    static void adicionarAlunos(int quantidade) {
        totalAlunos += quantidade;
    }
    
    public static void exibirAlunos() {
        System.out.println("Total de alunos: " + totalAlunos);
    }
}
