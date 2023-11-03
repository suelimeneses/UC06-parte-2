
package com.mycompany.uc6atividade2;


public class Hospedagem
{
    String descricao;
    double valorDiaria;
    
    //
    public Hospedagem(String descricao, double valorDiaria)
    {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public Hospedagem() 
    {
    }
    
    
    //
    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public double getValorDiaria() 
    {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria)
    {
        this.valorDiaria = valorDiaria;
    }
}
