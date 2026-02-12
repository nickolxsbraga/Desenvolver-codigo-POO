package atividade2;

public class Hospedagem 
{
                     private String descricao;
                     private double valorDiaria;

public Hospedagem(String descricao, double valorDiaria) 
 {
           this.descricao = descricao;
           this.valorDiaria = valorDiaria;
}
public String getDescricao()
{
           return descricao;
}
public double getValorDiaria()
{
           return valorDiaria;
}
public String toString()
{
           return "hospedagem [Descrição:"+ descricao + "Valor da diária:"+ valorDiaria +"]";
}
}