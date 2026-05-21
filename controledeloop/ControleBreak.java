package controledeloop;

public class ControleBreak {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++){

            if (i == 5){

                break; // sai do loop quando i é igual a 5
            }
            System.out.println(i);
        }
    } 
}