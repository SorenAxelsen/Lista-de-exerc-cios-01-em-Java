package Atividades_em_Java;
import java.util.Scanner;
public class atividade6 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaPares = 0;
        int somaImpares = 0;
        int somaDivisiveisPor3 = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }

            if (numero % 3 == 0) {
                somaDivisiveisPor3 += numero;
            }
        }

        
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Soma dos números divisíveis por 3: " + somaDivisiveisPor3);

        scanner.close();
    }
}

    

