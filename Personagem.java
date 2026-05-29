public class Personagem {
    String nome;
    int nivelPoder;

    public Personagem(String nome, int nivelPoder) {
        this.nome = nome;
        this.nivelPoder = nivelPoder;
    }

    public void tentarAumentarNivelDePoder(int novoPoder) {
        novoPoder += 10;
    }

    public void mudarNome(Personagem p, String novoNome) {
        p.nome = novoNome;
    }
}
