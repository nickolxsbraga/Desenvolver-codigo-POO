package problema2;

import java.util.Scanner;

public class Problema2 
{

    public static void main(String[] args) 
{
                     int idade1, idade2, desconto = 0;
                     String nome1, nome2;
                     String quartoA, quartoB;
                     Scanner entrada= new Scanner (System.in);
                    
                System.out.println("\n--ACESSANDO SISTEMA...--\n");
          
          System.out.println("Insira seu nome:");
          nome1 = entrada.nextLine();
          System.out.println("Olá, "+ nome1 +", seja bem vindo! qual a sua idade?:");
          idade1 = entrada.nextInt();
          entrada.nextLine();
          
          System.out.println("\nCADASTRO REALIZADO!\n");
          
                System.out.println("\n--ACESSANDO SISTEMA...--\n");
          
          System.out.println("Insira seu nome:");
          nome2 = entrada.nextLine();
          System.out.println("Olá, "+ nome2 +", seja bem vindo! qual a sua idade?:");
          idade2 = entrada.nextInt();
          
          System.out.println("\nCADASTRO REALIZADO!\n");
          
 if (idade2 > idade1)
{
              quartoA = nome2;
              quartoB = nome1;
              
 if(idade2 >= 60 ){
               desconto = 40;
}
}
 else 
{
              quartoA=nome1;
              quartoB=nome2;
 if(idade1>=60)
{
              desconto = 40;
}
}
                    System.out.print("Quarto A: "+ quartoA);
 if(desconto >0 )
{
                    System.out.println(" Com desconto de "+ desconto +"%");
}
 else
{
                    System.out.println("\n");
}
                    System.out.println("Quarto B: " + quartoB);
}
}