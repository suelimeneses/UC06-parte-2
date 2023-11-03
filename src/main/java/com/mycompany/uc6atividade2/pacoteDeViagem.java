
package com.mycompany.uc6atividade2;


public class pacoteDeViagem 
{
    Transporte transporte;
    Hospedagem hospedagem;
    String destino;
    int dias;
    
    
//
public void mostrarDados()
{
    System.out.println("Transporte: "+transporte.getTipo());
    System.out.println("Valor do transporte: $"+String.format("%.2f",transporte.getValor()));
    System.out.println("Hopedagem: "+hospedagem.getDescricao());
    System.out.println("Valor da diária: $"+String.format("%.2f", hospedagem.getValorDiaria()));
    System.out.println("Destino :"+destino);
    System.out.println("Quantidade de dias: "+dias);
    System.out.println( "Total de hospedagens: $"+String.format("%.2f",calcularHospedagem()));
}


//
public double calcularHospedagem()
{
    return hospedagem.getValorDiaria() * dias;
}


//
public double calcularLucro(int porcentagem,double valor)
{
    double lucro = valor * porcentagem / 100;
    return lucro + valor;        
}


//
public double calcularTotalPacote(double valor,double taxas)
{
     taxas = valor * taxas / 100;
     return valor + taxas;
}


//
    public pacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias)
    {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }

    public pacoteDeViagem() 
    {
    }
        
//
    public Transporte getTransporte()
    {
        return transporte;
    }

    public void setTransporte(Transporte transporte)
    {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem()
    {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem)
    {
        this.hospedagem = hospedagem;
    }

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public int getDias() 
    {
        return dias;
    }

    public void setDias(int dias) 
    {
        this.dias = dias;
    }
}
