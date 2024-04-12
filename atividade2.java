package Atividades_em_Java;
import java.util.Scanner;
public class atividade2 { 

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] numeros = new double[5];
    
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                numeros[i] = scanner.nextDouble();
            }
    
            double maiorNumero = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
            }
    
            System.out.println("O maior número informado é: " + maiorNumero);
    
            scanner.close();
        }
    }
    
    

