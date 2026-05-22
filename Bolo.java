

public class Bolo {
    int quantidadeAcucar;

    public static void main(String[] args) {
        
        Bolo boloChocolate = new Bolo();

        boloChocolate.quantidadeAcucar = 200;

        Bolo boloBaunilha = new Bolo();

        boloBaunilha.quantidadeAcucar = 150;

        System.out.println("Quantidadede açucar no bolo de chocolate:  " + boloChocolate.quantidadeAcucar);
        System.out.println("Quantidadede açucar no bolo de baunilha:  " + boloBaunilha.quantidadeAcucar);
    }
}

