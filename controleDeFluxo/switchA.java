package controleDeFluxo;

public class switchA {
    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1 -> System.out.println("Segunda");
                
            case 2 -> System.out.println("terça");
        
            case 3 -> System.out.println("Quarta");

            default -> System.out.println("Desconhecido");
        }
    }
}
