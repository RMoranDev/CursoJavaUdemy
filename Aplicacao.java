public class Aplicacao {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro("Chevrolex", "Onix");
        Carro c3 = new Carro("Fiat", "Uno","2006");

        c1.exibirDetalhes();
        c2.exibirDetalhes();
        c3.exibirDetalhes();
    }
}
