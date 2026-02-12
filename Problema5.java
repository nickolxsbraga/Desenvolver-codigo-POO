package problema5;

import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
                               boolean[][] quartos = new boolean[4][3]; 
                               String resposta;
                               int andar, quarto;
                               String status;

                               System.out.println("---ACESSANDO O SISTEMA...---");
                               
do
{
                     System.out.println("Informe o Andar e o Quarto");
                     System.out.print("Andar (1-4): ");
                     andar = entrada.nextInt() - 1;
                     System.out.print("Quarto (1-3): ");
                     quarto = entrada.nextInt() - 1;

if (andar >= 0 && andar < 4 && quarto >= 0 && quarto < 3) 
{
                               quartos[andar][quarto] = true;
} 
else
{
                     System.out.println("Número de andar ou quarto inválido. Tente novamente.");
}
                    System.out.print("Deseja informar outra ocupação? (S/N): ");
                    resposta = entrada.next();
}
while (resposta.equalsIgnoreCase("S"));

                     System.out.println("\nOcupação do hotel:");
                     
for (int i = 0; i < 4; i++)
{
                     System.out.println((i + 1) + "º andar:");
            
for (int j = 0; j < 3; j++) 
{
                    status = quartos[i][j] ? "ocupado" : "desocupado";
                    System.out.println(" - quarto " + (j + 1) + " " + status);
}
}
    }
    
}
