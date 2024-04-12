package Atividades_em_Java;
import java.util.Scanner;
public class atividade8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita ao usuário um número
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
    
            // Exibe a tabuada do número de 0 a 100
            for (int i = 0; i <= 100; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
    
            scanner.close();
        }
    }
    
