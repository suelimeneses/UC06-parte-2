
package com.mycompany.uc6atividade2;


public class Venda 
{
    String nome;
    String pagamento;
    pacoteDeViagem pacote;
    
    
//
public double converter(double valor,double cotacao)
{
    double resultado;
    return resultado = valor*cotacao;
}  


//
public void mostrarTotal(double valor,double cotacao)
{
    System.out.println("Nome: "+nome);
    System.out.println("Forma de pagamento: "+pagamento);
    System.out.println("Valor em reais: R$ " + String.format("%.2f",converter(valor,cotacao)));
    System.out.println("Valor em dólares $ "+ String.format("%.2f",valor));
}


//
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getPagamento()
    {
        return pagamento;
    }

    public void setPagamento(String pagamento)
    {
        this.pagamento = pagamento;
    }

    public pacoteDeViagem getPacote()
    {
        return pacote;
    }

    public void setPacote(pacoteDeViagem pacote)
    {
        this.pacote = pacote;
    }

//
    public Venda() 
    {
    }

    public Venda(String nome, String pagamento, pacoteDeViagem pacote)
    {
        this.nome = nome;
        this.pagamento = pagamento;
        this.pacote = pacote;
    }
}
