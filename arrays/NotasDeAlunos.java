package arrays;

import java.util.Arrays;

public class NotasDeAlunos {

    public static void main(String[] args) {
        int tamanho = 5;

        double[] notas = new double[tamanho];
        notas[0] = 7.56;
        notas[1] = 5.78;
        notas[2] = 8.45;
        notas[3] = 8.98;
        notas[4] = 7.32;

        // for (double i : notas) {
        //     System.out.println(i);
        // }

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < notas.length; i++) {
        //     sb.append(notas[i]);
        //     if (i < notas.length - 1) {
        //         sb.append(", ");
        //     }
        // }

        //System.out.println(sb.toString());
        //System.out.println(Arrays.toString(notas));

        System.out.println("Notas dos alunos: ");
        for (int i = 0; i <  tamanho; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
             System.out.print(", ");
            }
        }
    }
}
