package exercicios;

public class ControleBreakContinue {
    public static void main(String[] args) {
        

        int codigoDeSaida = 11;

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++){
            if (codigoCarteirinha == codigoDeSaida){
                System.out.println("Código " + codigoCarteirinha + " acionou o break. Encerrando o laço.");
                break;
            } 
            
            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10){
                System.out.println("Código " + codigoCarteirinha + " é aceito pelo hospital Santa Clara.");
                continue;
            }

            // Caso contrário, não é aceito
            System.out.println("Código " + codigoCarteirinha + " não é aceito pelo hospital.");
        }
    }
}
