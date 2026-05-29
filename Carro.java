public class Carro {
    String marcaCarro;
    String modeloCarro;
    String anoCarro;

    public Carro() {
        this.marcaCarro = "Desconhecida";
        this.modeloCarro = "Desconhecido";
    }
    public Carro(String marcaCarro, String modeloCarro) {
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
    }
    public Carro(String marcaCarro, String modeloCarro, String anoCarro) {
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + marcaCarro);
        System.out.println("Modelo: " + modeloCarro);
        System.out.println("Ano: " + anoCarro);
        System.out.println();
    }
}
