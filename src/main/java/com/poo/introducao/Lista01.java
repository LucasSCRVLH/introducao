package com.poo.introducao;
import java.util.Scanner;

public class Lista01 {

     static void ex1(){
        int num1;
        int num2;
        int res;

        System.out.println("Digite um número:");
        Scanner sc = new Scanner (System.in);

        num1 = sc.nextInt();

        System.out.println("Digite outro número:");
        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("A soma é:" + " "+ res);
     }

     static void ex2(){
      String nome;
      String sobrenome;

      System.out.println("Escreva seu nome:");
      
      Scanner sc = new Scanner (System.in);

      nome = sc.nextLine();

      System.out.println("Digite seu sobrenome:");

      sobrenome = sc.nextLine();

      System.out.println("Seu nome é:" + nome + " "+ sobrenome);      
     }

     static void ex3(){

      Double dolar = 5.25;
      Double real;
      Double result;

      System.out.println("Escreva um valor em Reais para converter em Dólar:");  

      Scanner sc = new Scanner (System.in);  
      real = sc.nextDouble();

      result = real / dolar;

      System.out.println("O valor convertido em Reais é:"+ " "+ result);

     }

     static void ex4(){

      int numeroescolhido;
      int antecessor;
      int sucessor;

      System.out.println("Digite um número para saber seu sucessor e antecessor");

      Scanner sc = new Scanner (System.in);

      numeroescolhido = sc.nextInt();

      antecessor = numeroescolhido - 1;
      sucessor = numeroescolhido + 1;

      System.out.println("Você escolheu o número:" + numeroescolhido + " " + "Seu antecessor é:" + " " + antecessor + " " + "e o sucessor é:" + " " + sucessor);

    }
      
      static void ex5(){   

      Float largura;
      Float comprimento;
      Float area;
      int valor = 150;
      Float precoterreno;
      
      System.out.println("Digite a largura do terreno em metros:");
      
      Scanner sc = new Scanner (System.in);

      largura = sc.nextFloat();

      System.out.println("Digite o comprimento do terreno em metros:");

      comprimento = sc.nextFloat();

      area = largura * comprimento;

      precoterreno = area * valor;

        

      System.out.println("O valor por m² é R$" + " " + valor+"," + " " + "Seu terreno é de:"+ " " + area +"m²,"+ " " + "Sendo assim, o valor calculado é de R$:" + " " +precoterreno);


    }
    static void ex6(){

      Float km;
      Float litros;
      Float resultado;

      System.out.println("Escreva a distância percorrida em KMs pelo seu veículo:");

      Scanner sc = new Scanner(System.in);
      km =  sc.nextFloat();

      System.out.println("Escreva o consumo em litros do seu veículo durante o percurso:");

      litros = sc.nextFloat();


      resultado = km / litros;

      System.out.println("O consumo médio do seu veículo é:" + " " + resultado + " " + " Km/L");




    }
     
}
