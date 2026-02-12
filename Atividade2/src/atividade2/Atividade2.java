package atividade2;

import java.util.Scanner;

public class Atividade2
{

    public static void main(String[] args) 
{
                               Scanner entrada = new Scanner (System.in);   
                               
           // cadastrando o transporte        
          System.out.println("Informe o tipo de transporte(Aéreo, Marítimo ou Rodoviário):");
          String tipoTransporte= entrada.nextLine();
          System.out.println("Informe o valor:$");
          double valorTransporte = entrada.nextDouble();
          Transporte transporte = new  Transporte(tipoTransporte, valorTransporte);
          
          //cadastrando hospedagem
          entrada.nextLine();
          System.out.println("Insira a descrição da viagem:");
          String descricao = entrada.nextLine();
          System.out.println("Insira o valor da diária da hospedagem:$");
          double valorDiaria = entrada.nextDouble();
          Hospedagem hospedagem = new Hospedagem(descricao, valorDiaria);
          
          //cadastrando viagem
          entrada.nextLine();
          System.out.println("Qual o destino da viagem?:");
          String destino = entrada.nextLine();
          System.out.println("Quantos dias será de viagem?:");
          int quantDias = entrada.nextInt();
          PacotedeViagem pacote = new PacotedeViagem(transporte, hospedagem, destino, quantDias);
          
          entrada.nextLine();
          System.out.println("Informe a margem de lucro(%):");
          double margem = entrada.nextDouble();
          System.out.println("Insira as taxas adicionais:$");
          double taxaAdc = entrada.nextDouble();
          double calcularTotal = pacote.calcularTotal(margem, taxaAdc);
          
           // cadastrando dados do cliente 
           entrada.nextLine();
           System.out.println("Qual o nome do cliente?:");
           String nomeCliente = entrada.nextLine();
           System.out.println("Insira a forma de pagamento do cliente:");
           String formaPagamento = entrada.nextLine();
           Venda venda = new Venda(nomeCliente, formaPagamento, pacote);
          
           
           //convertendo todos os valores
           entrada.nextLine();
          System.out.println("Qual a cotação atual do dólar?:");
          double cotacaoDolar = entrada.nextDouble();
          double valorTotalReais = calcularTotal * cotacaoDolar;
          
          //info de vendas
          System.out.println("\n----VENDAS----");
          System.out.println("Cliente:"+nomeCliente);
          System.out.println("Forma de pagamento:"+ formaPagamento);
          System.out.println("Valor total do pacote ($):"+ calcularTotal);
          System.out.println("Valor total do pacote (R$):"+ valorTotalReais);
}    
}
