import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite 5 números :");
        
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Número" + (i + 1) + ": ");
            int num1 = numero.nextInt();

            if (num1 > maior) {
                maior = num1;
                
            }
        }
        System.out.println("O maior número é :" + maior);
    }
}