package problema4;

import java.util.Scanner;

public class Problema4 
{

  public static void main(String[] args)
 {
                               String [] registro = new String[14];
                               String nomePesquisa;
                               int cadastro  =  0;
                               int opcao;
                               int nomeEncontrado = -1;
                               Scanner entrada = new Scanner(System.in);
do
{
                     System.out.println("\nEscolha a opção desejada.\n1-Registrar\n2-Pesquisar\n3-Sair\nDigite aqui:");
                     opcao = entrada.nextInt();
                     entrada.nextLine();
                     
switch (opcao)
{
case 1:
    
if (cadastro < registro.length)
{
                        System.out.println("\nInsira o nome que deseja registrar:");
                        registro[cadastro] = entrada.nextLine();                      
                        cadastro++;
                        System.out.println("\nNome registrado com sucesso!\n");
}
else 
{
                        System.out.println("Registro cheio! Não é possível adicionar mais nomes.");
}
break;

case 2:

           System.out.println("\nDigite o nome que deseja procurar:");
                    nomePesquisa = entrada.nextLine();
                    
 for (int i = 0; i < cadastro; i++) 
 {
                        if (registro[i].equalsIgnoreCase(nomePesquisa)) 
{ 
                            nomeEncontrado = i;
break;
}
}

                    if (nomeEncontrado != -1) 
{
                        System.out.println(nomePesquisa + " foi encontrado no registro número " + nomeEncontrado + "!\n");
}
 else 
{
                        System.out.println("Nome não encontrado.\n");
}
break;


case 3:

            System.out.println("\nFim do programa.\n");
break;

default:

            System.out.println("\nOpção inválida, tente novamente \n");
break;
}
}
while(opcao !=3);
}  
}
