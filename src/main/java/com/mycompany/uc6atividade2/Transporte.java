
package com.mycompany.uc6atividade2;


public class Transporte 
{
    String tipo;
    double valor;
    
    

    public Transporte() 
    {
    }

    public Transporte(String tipo, double valor) 
    {
        this.tipo = tipo;
        this.valor = valor;
    }
    
//
    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
}
