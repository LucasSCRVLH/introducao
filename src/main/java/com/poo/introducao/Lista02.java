package com.poo.introducao;
import java.util.Scanner;

public class Lista02 {

    static void ex1(){
    int NumeroDigitado;
    
    System.out.println("Escreva um número para saber se ele é par: ");

    Scanner sc = new Scanner (System.in);
    NumeroDigitado = sc.nextInt();
    
    sc.close();
    
    if(NumeroDigitado % 2 == 0){
        System.out.println(NumeroDigitado + " "+"É um número par");
    } else{

    System.out.println(NumeroDigitado + " " + "É um número ímpar");
    }
 }
    static void ex2(){
    
        Scanner sc= new Scanner(System.in);
    
        int primeiroNumero;
    
        int segundoNumero;

        System.out.println("Escreva o primeiro número");
        primeiroNumero = sc.nextInt();

        System.out.println("Escreva o segundo número:");
        segundoNumero = sc.nextInt();
        sc.close();
        
        if(primeiroNumero==segundoNumero){

            System.out.println(primeiroNumero+ " " + "é igual"+ " " + segundoNumero);
        
        }else if(primeiroNumero>segundoNumero){

            System.out.println(primeiroNumero + " é maior que" + " " + segundoNumero);
        
        }else{
            
            System.out.println(primeiroNumero+ " "+ "é menor que"+ " " + segundoNumero);
        }
    }

     void ex3(){
    
        Scanner sc = new Scanner(System.in);
        int idade;
        String gestante  ;
        String deficiente ;

        System.out.println("Seja bem vindo ao nosso atendimento, responda o questionário abaixo:");
        System.out.println("Digite sua idade:");

        idade = sc.nextInt();
         
        System.out.println("Vamos presseguir!");
        
        System.out.println("Possui alguma deficiência?");
        sc.nextLine();
        deficiente = sc.nextLine();
        
        System.out.println("Está em gestação?");
        gestante = sc.nextLine();
    
        if(idade < 65 &&  !gestante.equalsIgnoreCase("sim")  &&  !deficiente.equalsIgnoreCase("sim") ){
            System.out.println("Sua fila será comum!");

        }else{
            System.out.println("Sua fila será preferencial");
        }

     }
     static void ex4(){



     }


}

