public class PacotedeViagem 
{
                     private Transporte transporte;
                     private Hospedagem hospedagem;
                     private String destino;
                     private int quantDias;

public PacotedeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantDias) 
{
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantDias = quantDias;
}
public double calcularTotalHospedagem()
{
           return hospedagem.getValorDiaria() * quantDias;
}
public double calcularValorLucro(double margem)
{
           return calcularTotalHospedagem() + transporte.getValor() * (1 + margem / 100);
}
public double calcularTotal(double margemDlucro, double taxaAdc)
{
           double totalHospedagem = calcularTotalHospedagem();
           double totalTransporte = transporte.getValor();
           double lucro = totalTransporte * (margemDlucro / 100);       
           return totalHospedagem + totalTransporte + lucro + taxaAdc;
}
}
