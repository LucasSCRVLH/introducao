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

        System.out.println("A soma é:" + res);
     }
}
