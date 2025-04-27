import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = numeros.nextInt();
        
        System.out.println("Digite o segundo número:");
        int num2 = numeros.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Os números que estão no intervalo por eles são :");

        for(int i = menor ;i <= maior;i++){
            System.out.println(i);
        }
    }
}