public class Produto {
     private String nome;
     private double preco;
     private int quantidadeEstoque;

     public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;

     }

     // Getters
     public String getNome(){
        return nome;
     }

     public double getPreco(){
        return preco;
     }

     public int getQuantidadeEstoque(){
        return quantidadeEstoque;
     }

     // Setters
     public void setNome(String nome){
        this.nome = nome;
     }
     public void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
         } 
     }
     public void setQuantidadeEstoque(int quantidadeEstoque){
        if (quantidadeEstoque > 0) {
            this.quantidadeEstoque = quantidadeEstoque;
         }
     }

     public void exibirInformacoes(){
         System.out.println("Nome: " + nome);
         System.out.println("Preço: " + preco);
         System.out.println("Estoque: " + quantidadeEstoque);
         System.out.println("-----------------------------");
     }
}
