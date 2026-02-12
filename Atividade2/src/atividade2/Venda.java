package atividade2;

public class Venda 
{
                    private String nomeCliente;
                    private String formaPagamento;
                    private PacotedeViagem pacote;

    public Venda(String nomeCliente, String formaPagamento, PacotedeViagem pacote) 
{
           this.nomeCliente = nomeCliente;
           this.formaPagamento = formaPagamento;
           this.pacote = pacote;
}
public double converterParaReais(double valor, double cotacaoDolar)
{
           return valor * cotacaoDolar;  
}
                    @Override
                    public String toString()
{
           return "Venda[Cliente:"+nomeCliente+", Forma de pagamento:"+formaPagamento+", Pacote:"+pacote+"]";
}
}