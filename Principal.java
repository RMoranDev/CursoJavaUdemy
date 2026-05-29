// Classe principal para testar
public class Principal {
    public static void main(String[] args) {
        // Criando instâncias de Produto
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Smartphone", 2500.00, 20);
        Produto p3 = new Produto("Mouse", 80.00, 50);

        // Exibindo informações dos produtos
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
