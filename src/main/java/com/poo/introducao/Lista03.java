package com.poo.introducao;
import java.util.Scanner;
import java.util.Random;
public class Lista03 {

    static void ex1(){
    int segundos ;
    Scanner sc= new Scanner(System.in);

    System.out.println("Digite o número de segundos (entre 1 e 59):");
        segundos = sc.nextInt();

        while (true) {
            try {
                segundos = Integer.parseInt(sc.nextLine());
                if (segundos < 1 || segundos > 59) {
                    System.out.println("Número inválido! Digite um número entre 1 e 59:");
                } else {
                    break; 
                }
         }catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite um número entre 1 e 59:");
        } System.out.println("Contagem regressiva iniciada para " + segundos + " segundos...");

        try {
            while (segundos > 0) {
                System.out.println(segundos);
                Thread.sleep(1000); 
                segundos--;
            }
            System.out.println("Tempo esgotado!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {sc.close();
    }

 }

}
    static void ex2(){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número para ver a tabuada: ");
    int numero = sc.nextInt();


    System.out.println("Tabuada de " + numero + ":");

    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }sc.close();
}

    static void ex3(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    int num1 = sc.nextInt();
    
    System.out.print("Digite o segundo número inteiro: ");
    int num2 = sc.nextInt();

    int menor = Math.min(num1, num2);
    int maior = Math.max(num1, num2);
    System.out.println("Números pares entre " + menor + " e " + maior + ":");
    for (int i = menor; i <= maior; i++) {
        if (i % 2 == 0) {System.out.println(i);
     } sc.close();
     }

}   
static void ex4(){
 Scanner sc = new Scanner(System.in);
Random random = new Random();


int numeroEscolhido = random.nextInt(100) + 1;


System.out.println("Um número entre 1 e 100 foi escolhido. Tente adivinhar!");
while (true) {
    System.out.print("Digite sua tentativa: ");
    int tentativa = sc.nextInt();

   
    if (tentativa == numeroEscolhido) {
        System.out.println("Parabéns! Você acertou o número " + numeroEscolhido);
        break;
    } else if (tentativa < numeroEscolhido) {
        if (numeroEscolhido - tentativa <= 5) {
            System.out.println("Tá quente! O número é um pouco maior.");
        } else {
            System.out.println("Muito baixo! Tente um número maior.");
        }
    } else { 
        if (tentativa - numeroEscolhido <= 5) {
            System.out.println("Tá quente! O número é um pouco menor.");
        } else {
            System.out.println("Muito alto! Tente um número menor.");
        }
    }
    }sc.close();
}




}