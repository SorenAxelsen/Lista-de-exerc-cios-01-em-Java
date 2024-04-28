package Atividades_em_Java;
import java.util.Scanner;
public class atividade12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalPessoas = 25;
            int quantidadeAcima50Anos = 0;
            float somaAlturas10_20Anos = 0;
            int quantidadePesoMenor40 = 0;
            int totalPessoasAnalisadas = 0;
    
            
            for (int i = 0; i < totalPessoas; i++) {
                System.out.print("Digite a idade da pessoa: ");
                int idade = scanner.nextInt();
    
                System.out.print("Digite a altura (em metros) da pessoa: ");
                float altura = scanner.nextFloat();
    
                System.out.print("Digite o peso (em kg) da pessoa: ");
                float peso = scanner.nextFloat();
    
                
                if (idade > 50) {
                    quantidadeAcima50Anos++;
                }
    
                
                if (idade >= 10 && idade <= 20) {
                    somaAlturas10_20Anos += altura;
                }
    
                
                if (peso < 40) {
                    quantidadePesoMenor40++;
                }
    
                
                totalPessoasAnalisadas++;
            }
    
            
            float mediaAlturas10_20Anos = somaAlturas10_20Anos / totalPessoasAnalisadas;
    
            
            float porcentagemPesoMenor40 = (quantidadePesoMenor40 / (float) totalPessoasAnalisadas) * 100;
    
            
            System.out.println("a) Quantidade de pessoas com idade superior a 50 anos: " + quantidadeAcima50Anos);
            System.out.println("b) Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10_20Anos);
            System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas: " + porcentagemPesoMenor40 + "%");
    
            scanner.close();
        }
    }



