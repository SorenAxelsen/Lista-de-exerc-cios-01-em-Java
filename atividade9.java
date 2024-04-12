package Atividades_em_Java;
import java.util.Scanner;
public class atividade9 {
    
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print(numero + "! = ");
        int resultado = fatorial(numero);
        for (int i = 1; i <= numero; i++) {
            if (i != numero) {
                System.out.print(i + " * ");
            } else {
                System.out.println(i + " = " + resultado);
            }
        }
        scanner.close();
    }
}

    
