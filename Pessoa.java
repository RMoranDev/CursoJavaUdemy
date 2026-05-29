public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    String telefone;

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override 
    public String toString() {
        return "Nome: " + nome + " Idade " + idade +
                " Endereço " + endereco + " Telefone " + telefone;
    }
}
