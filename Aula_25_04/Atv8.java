import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite 5 números:");
            int numeros = num.nextInt();
            soma += numeros;
        }

        double media = soma / 5.0;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é " + media);
    }
}