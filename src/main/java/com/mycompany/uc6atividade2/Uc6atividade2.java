
package com.mycompany.uc6atividade2;

import java.util.Scanner;


public class Uc6atividade2 {

    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner(System.in);

        //ENTRADA PARA TRANSPORTE
        System.out.println("Digite o tipo de transporte e o valor: ");
        String tipo = entrada.nextLine();
        double valor = entrada.nextDouble();
        
        
        //ENTRADA PARA HOSPEDAGEM
        System.out.println("Digite a opção escolhida da hospedagem e o valor da diária");
        entrada.nextLine();
        String descricao = entrada.nextLine();
        double vlrDiaria = entrada.nextDouble();
        
        
        //ENTRADA PARA PCT DE VIAGEM
        System.out.println("Digite o destino e a quantidade de diárias");
        entrada.nextLine();
        String destino = entrada.nextLine();
        int dias = entrada.nextInt();
        
        
        //OBJETOS
        Transporte transporte = new Transporte(tipo, valor);
        Hospedagem hospedagem = new Hospedagem(descricao, vlrDiaria);
        pacoteDeViagem pacote = new pacoteDeViagem(transporte, hospedagem, destino, dias);
        pacote.mostrarDados();
        
        
        //LUCRO
        System.out.println("\nDigite a margem de lucro(porcentagem)");
        int porcentagem = entrada.nextInt();
        double totalPacote = pacote.calcularLucro(porcentagem, (pacote.calcularHospedagem() + transporte.getValor()));
        System.out.println("Lucro: $ " + String.format("%.2f", totalPacote));
        
        
        //TOTAL DO PACOTE
        System.out.println("\nDigite as taxas adicionais(porcentagem)");
        int taxa = entrada.nextInt();
        System.out.println("Total do pacote: $ " + String.format("%.2f", pacote.calcularTotalPacote(totalPacote, taxa)));
        
        
        //VENDA
        System.out.println("Digite o nome do cliente e a forma de pagamento:");
        entrada.nextLine();
        String nome = entrada.nextLine();
        String pagamento = entrada.nextLine();
        
        
        //
        Venda venda = new Venda(nome, pagamento, pacote);
        
        
        //CONVERSÃO DE DOLAR PARA REAL
        System.out.println("Digite o valor para conversão e a valor atual do dólar");
        double dolares = entrada.nextDouble();
        double cotacao = entrada.nextDouble();
        System.out.println("Total convertido: R$ "+String.format("%.2f",venda.converter(dolares,cotacao)));
        
        
        //
        venda.mostrarTotal(pacote.calcularTotalPacote(totalPacote, taxa), cotacao);

    }
    
}
