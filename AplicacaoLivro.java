public class AplicacaoLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("Algotirmos", "Pepe");
        Livro l3 = new Livro("Java", "Pedero", 2015, 35);

        // l1.exibirDetalhes();
        // l2.exibirDetalhes();
        // l3.exibirDetalhes();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
