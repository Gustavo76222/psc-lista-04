public class Atv1 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        int pares = 0;
        for (int i : numeros){
            if (i % 2 == 0) {
                pares++;   
            }
        }
        System.out.println("Total de números páres :" + pares);
    }
}