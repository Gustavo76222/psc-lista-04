public class Atv2 {
    public static void main(String[] args) {
        int[] numeros = {34,76,100,8,96,43};

        int maior = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é :" + maior);
    }
}