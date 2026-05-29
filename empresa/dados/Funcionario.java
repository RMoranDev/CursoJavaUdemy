package empresa.dados;

public class Funcionario {
    private String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String obterInfo(){
        return "Nome: " + nome + "\nSalário: " + salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
    public void aumentarSalario(int porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    public void aumentarQualquerSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario;
    }

}


