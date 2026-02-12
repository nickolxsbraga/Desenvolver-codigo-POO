package problema3;

import java.util.Scanner;

public class Problema3 
{
    public static void main(String[] args) 
{        
                                int valorDiaria, idade;
                                int valorTotal = 0;
                                int totalHospd = 0;
                                int contGratuidade = 0;
                                int contMeia = 0;
                                int contInteira = 0;
                                String nomeHospede, continuar = "S";
                                Scanner entrada = new Scanner(System.in);
                                
                     System.out.println("\n---BEM VINDO AO SISTEMA---\n");
                     
                     System.out.print("Qual o valor da diária?: ");
                     valorDiaria = Integer.parseInt(entrada.nextLine()); // estava dando erro para inserir o nome, entao pesquisei e achei esse comando para parar de bugar
                     
do
{            
           System.out.print("\nDigite seu nome: ");
           nomeHospede = entrada.nextLine();
           System.out.print("\nDigite sua idade: ");
           idade = entrada.nextInt();
           
                    entrada.nextLine();
                            
 if (idade <= 4)
 {
           System.out.print("\n"); 
           System.out.print(nomeHospede +" Possui gratuidade!\n");
           contGratuidade++;
 }
 else if (idade >= 80)
 {
           
           System.out.print("\n");
           System.out.print(nomeHospede +" Possui meia-entrada!\n");
           contMeia++;
           valorTotal += valorDiaria / 2;
 }
else
{
           System.out.print("\n"); 
           System.out.print(nomeHospede +" Paga o valor total!\n");
           contInteira++;
           valorTotal = valorDiaria;
}
            totalHospd++;
           System.out.print("\nDeseja Continuar cadastrando hóspedes?(S/N):");
           continuar = entrada.nextLine();
}          
while(continuar.equalsIgnoreCase("S")); // usei o comando equalsIgnoreCase para considerar letras minusculas e maiusculas como se fossem iguais

          System.out.println("\nO valor total foi de: R$"+valorTotal+","+contMeia+" meia(s)-entrada(s), "+contGratuidade+" gratuidade(s) e "+contInteira+" Inteira(s).\n");
          System.out.println("\nFim do programa.\n");

}
}                   