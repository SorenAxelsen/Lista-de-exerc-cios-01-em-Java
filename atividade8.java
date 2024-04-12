package Atividades_em_Java;
import java.util.Scanner;
public class atividade8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
    
            for (int i = 0; i <= 100; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
    
            scanner.close();
        }
    }



