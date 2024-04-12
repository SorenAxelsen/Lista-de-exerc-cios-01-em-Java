package Atividades_em_Java;
import java.util.Scanner;
public class atividade4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 7;
        int contadorPessoasAcima90Kg = 0;
        int somaIdades = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (em kg) da " + (i+1) + "ª pessoa: ");
            float peso = scanner.nextFloat();

            if (peso > 90) {
                contadorPessoasAcima90Kg++;
            }

            somaIdades += idade;
        }

        float mediaIdades = (float) somaIdades / totalPessoas;

        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + contadorPessoasAcima90Kg);
        System.out.println("Média das idades das sete pessoas: " + mediaIdades);

        scanner.close();
    }
}

    

