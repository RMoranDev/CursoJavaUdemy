public class AplicacaoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ricardo";
        p1.setIade(35);
        p1.setEndereco("Rua Pedro Ivo, No 35, Curitiba.");
        p1.setTelefone("41-981.427.263");
        System.out.println(p1.getIdade());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
    }
}
