package Atividades_em_Java;
import java.util.Scanner;

public class atividade5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorAcima50Anos = 0;
        float somaAlturas10_20Anos = 0;
        int contadorAlturas10_20Anos = 0;
        int contadorPesoMenor40 = 0;

        for (int i = 0; i < 25; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (em metros) da pessoa: ");
            float altura = scanner.nextFloat();

            System.out.print("Digite o peso (em kg) da pessoa: ");
            float peso = scanner.nextFloat();

            // Verificando as condições
            if (idade > 50) {
                contadorAcima50Anos++;
            }
            
            if (idade >= 10 && idade <= 20) {
                somaAlturas10_20Anos += altura;
                contadorAlturas10_20Anos++;
            }

            if (peso < 40) {
                contadorPesoMenor40++;
            }
        }

        // Calculando a média das alturas
        float mediaAlturas10_20Anos = contadorAlturas10_20Anos != 0 ? somaAlturas10_20Anos / contadorAlturas10_20Anos : 0;

        // Calculando a porcentagem de pessoas com peso inferior a 40 kg
        float porcentagemPesoMenor40 = (contadorPesoMenor40 / 25f) * 100;

        // Exibindo os resultados
        System.out.println("a) Quantidade de pessoas com idade superior a 50 anos: " + contadorAcima50Anos);
        System.out.println("b) Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10_20Anos);
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas: " + porcentagemPesoMenor40 + "%");

        scanner.close();
    }
}

    

