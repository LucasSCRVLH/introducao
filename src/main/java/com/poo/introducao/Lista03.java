package com.poo.introducao;
import java.util.Scanner;
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





 }