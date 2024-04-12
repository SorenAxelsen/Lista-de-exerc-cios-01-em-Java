package Atividades_em_Java;
import java.util.Scanner;
public class atividade3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Há " + pares + " números pares informados.");

        scanner.close();
    }
}


