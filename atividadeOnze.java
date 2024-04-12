package Atividades_em_Java;
import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 7;
        int contadorMais90Kg = 0;
        int somaIdades = 0;

        // Loop para receber idade e peso de sete pessoas
        for (int i = 0; i < totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (em kg) da pessoa: ");
            float peso = scanner.nextFloat();

            // Verifica se o peso é superior a 90 quilos
            if (peso > 90) {
                contadorMais90Kg++;
            }

            // Soma das idades
            somaIdades += idade;
        }

        // Cálculo da média das idades
        float mediaIdades = (float) somaIdades / totalPessoas;

        // Exibição dos resultados
        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + contadorMais90Kg);
        System.out.println("Média das idades das sete pessoas: " + mediaIdades);

        scanner.close();
    }
}
