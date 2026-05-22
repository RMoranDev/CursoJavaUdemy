package empresa.dados;

public class Funcionario {
    private String nome;
    String cargo;
    int idade;
    double salario;

    private Funcionario(String nome, String cargo, int idade, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }

    Funcionario(){
        Funcionario func = new Funcionario("Mario", "Adm", 40, 4000);
    }
}


