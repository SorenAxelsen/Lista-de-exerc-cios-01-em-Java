package Atividades_em_Java;
import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
    
