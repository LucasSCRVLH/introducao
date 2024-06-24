package com.poo.introducao;
import java.util.ArrayList;
import java.util.Scanner;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

public class Lista04 {
    static void ex1(){
       

    double[] vendasDoDia = {150.50, 280.75, 95.30, 210.60, 180.25};
    double totalVendas = 0.0;
    for (int i = 0; i < vendasDoDia.length; i++) {
        totalVendas += vendasDoDia[i];
    }
    System.out.println("Total de vendas do dia: R$" + totalVendas);
    }
      
    static void ex2(){

    double[] vendasDoDia = {150.50, 280.75, 95.30, 210.60, 180.25};
    double menorValor = vendasDoDia[0];
    double maiorValor = vendasDoDia[0];

    for (int i = 1; i < vendasDoDia.length; i++){
    
    if (vendasDoDia[i] < menorValor){

        menorValor = vendasDoDia[i];
    } if (vendasDoDia[i]> maiorValor){
        maiorValor = vendasDoDia[i];
    }
}
    
    
    System.out.println("Menor valor de venda é R$:" + " " + menorValor);
    System.out.println("Maior valor de venda é R$:" + " " + maiorValor);
    

} 

    static void ex3(){
    double[] vendasDoDia = {150.50, 280.75, 95.30, 210.60, 180.25};
    double media;
    double somaVendas = 0;

    for (int i = 0; i< vendasDoDia.length; i++){
        somaVendas += vendasDoDia[i];
    }
     media =  somaVendas / vendasDoDia.length;

     System.out.println("A média é:" +  " " + media);
}   
    static void ex4(){

    int[] numerosInteiros = {3,5,6,7,8,10,22,55,110};
    int numerospares = 0;
    
    for (int i : numerosInteiros) {
        
        if (i % 2 == 0) {
            numerospares++;  
        }
    }System.out.println("A quantidade de números pares é:" + " " + numerospares);

} 
    static void ex5(){
    Scanner sc = new Scanner(System.in);
    String[] listaCompras = new String[10];
    double[] precos = new double[10];
    int indice = 0;

    while (true) {
        int opcao;
        int numRemover;
        double tempPreco;
        String tempItem;
        String item;

        System.out.println("\nMenu:");
        System.out.println("1 - Inserir item");
        System.out.println("2 - Ver lista de compras");
        System.out.println("3 - Remover item");
        System.out.println("4 - Ordenar por preço crescente");
        System.out.println("5 - Ordenar por preço decrescente");
        System.out.println("6 - Sair");
        System.out.println("Escolha uma opção: ");
        opcao = sc.nextInt();
        sc.nextLine(); 
        switch (opcao) {
            case 1:
                System.out.println("Digite o item a ser inserido: ");
                item = sc.nextLine();

                listaCompras[indice] = item;
                System.out.println("Digite o preço do item: ");
                precos[indice] = sc.nextDouble();

                indice++;
                break;

            case 2:
                System.out.println("\nLista de Compras:");
                for (int i = 0; i < indice; i++) {
                    System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                }
                break;

            case 3:
                System.out.println("\nDigite o número do item a ser removido: ");
                numRemover = sc.nextInt();

                if (numRemover > 0 && numRemover <= indice) {
                    for (int i = numRemover - 1; i < indice - 1; i++) {
                        listaCompras[i] = listaCompras[i + 1];
                        precos[i] = precos[i + 1];
                    }
                    indice--;
                    System.out.println("Item removido com sucesso.");
                } else {
                    System.out.println("Número de item inválido.");
                }
                break;

            case 4:
                for (int i = 0; i < indice - 1; i++) {
                    for (int j = 0; j < indice - i - 1; j++) {
                        if (precos[j] > precos[j + 1]) {

                            tempPreco = precos[j];
                            precos[j] = precos[j + 1];
                            precos[j + 1] = tempPreco;

                            tempItem = listaCompras[j];
                            listaCompras[j] = listaCompras[j + 1];
                            listaCompras[j + 1] = tempItem;
                        }
                    }
                }

                System.out.println("\nLista de Compras ordenada por preço crescente:");
                for (int i = 0; i < indice; i++) {
                    System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                }
                break;

            case 5:
                for (int i = 0; i < indice - 1; i++) {
                    for (int j = 0; j < indice - i - 1; j++) {
                        if (precos[j] < precos[j + 1]) {
                           
                            tempPreco = precos[j];
                            precos[j] = precos[j + 1];
                            precos[j + 1] = tempPreco;

                            tempItem = listaCompras[j];
                            listaCompras[j] = listaCompras[j + 1];
                            listaCompras[j + 1] = tempItem;
                        }
                    }
                }

                System.out.println("\nLista de Compras ordenada por preço decrescente:");
                for (int i = 0; i < indice; i++) {
                    System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                }
                break;

            case 6:
                System.out.println("Saindo...");
                sc.close();
                return;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }





}

    
    
    










}







    











