package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] meuArray;

        // int[] meuArray = new int[]{9, 4, 8}; é a forma mais direta e completa.

        meuArray = new int[3];
        meuArray[0] = 7;
        meuArray[1] = 9;
        meuArray[2] = 6;
        // meuArray = new int[]{6, 9, 7};

        // Alterando Elementos do Array
        meuArray[0] = 10;

        // Percorrendo Arrays
        for (int i = 0; i < meuArray.length; i++) {

            System.out.println(meuArray[i]);
        }

        for (int elemento : meuArray) {
            System.out.println(elemento);
        }
    }
}
