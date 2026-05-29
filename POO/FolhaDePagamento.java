package POO;

import empresa.dados.*;
public class FolhaDePagamento {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Ricardo", 5000.00);
        Funcionario funcionario2 = new Funcionario("Maria", 6000.00);
        System.out.println(funcionario1.obterInfo());
        System.out.println("-".repeat(30));
        System.out.println(funcionario2.obterInfo());
        System.out.println();

    
        //funcionario1.aumentarQualquerSalario(funcionario1, 3000);
        funcionario1.aumentarSalario(10);

        System.out.println(funcionario1.obterInfo());
        //System.out.println("-".repeat(30));
        //System.out.println(funcionario2.obterInfo());
    }
}
 