import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner populacao = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a população inicial do país A: ");
            int populacaoA = populacao.nextInt();
            System.out.print("Digite a taxa de crescimento anual do país A (em %): ");
            double taxaA = populacao.nextDouble();
            System.out.print("Digite a população inicial do país B: ");
            int populacaoB = populacao.nextInt();
            System.out.print("Digite a taxa de crescimento anual do país B (em %): ");
            double taxaB = populacao.nextDouble();
            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaA;
                populacaoB += populacaoB * taxaB;
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");

            System.out.print("Deseja continuar? (S/N): ");
            continuar = populacao.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        populacao.close();
    }
}