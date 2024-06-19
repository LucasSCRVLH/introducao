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
        } sc.close();

     }
     static void ex4(){
         int idade;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seja bem vindo, por favor informe sua idade:");
        idade = sc.nextInt();

        if(idade<16){
            System.out.println("Você não pode participar do evento. Idade insuficiente!");

        }else if( idade ==16 || idade == 17 ){
            System.out.println("Somente acompanhado pelo responsável!");
        }else{
            System.out.println("Você é maior de idade. Pode entrar normalmente!");
            sc.close();
        }
     }
     static void ex5(){

        String login = "lucas";
        String senha = "12345";
        Scanner sc = new Scanner(System.in);
        Boolean acessoPermitido = false;
        

        while (!acessoPermitido) {
        System.out.print("Digite o login: ");
         String loginDigitado = sc.nextLine();
        
        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();
    
         if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
            System.out.println("Login e senha corretos. Acesso permitido!");
            acessoPermitido = true;
        } else if (!loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
            System.out.println("Login incorreto. Verifique o login digitado.");
        } else if (loginDigitado.equals(login) && !senhaDigitada.equals(senha)) {
            System.out.println("Senha incorreta. Verifique a senha digitada.");
        } else {
            System.out.println("Login e senha incorretos. Verifique as informações digitadas.");
        }
        } sc.close();
    }
    
    static void ex6(){
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite a nota da primeira prova: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = sc.nextDouble();

        
        if (nota1 > 6 && nota2 > 6) {
            System.out.println("Parabéns! Você está aprovado.");
        } else {
            
            System.out.print("Digite a nota de recuperação: ");
            double notaRecuperacao = sc.nextDouble();

            
        if (nota1 <= nota2) {
        nota1 = notaRecuperacao;
        } else {
         nota2 = notaRecuperacao;
        }
         double media = (nota1 + nota2) / 2;
         if (media >= 6) {
         System.out.println("Parabéns! Você está aprovado com a recuperação.");
        } else {
        System.out.println("Infelizmente, você está reprovado!");         
        }
        } sc.close();

    }
    
    static void ex7(){
       
        Scanner sc = new Scanner(System.in);
        int NumeroPrimeiro;
        int numeroSegundo;
        
        System.out.println("Escreva o primeiro número: ");
        NumeroPrimeiro = sc.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        numeroSegundo = sc.nextInt();
        
        if(NumeroPrimeiro % numeroSegundo == 0){
            System.out.println(NumeroPrimeiro + " "+"É divisível por"+ " " + numeroSegundo);
        } else{
    
        System.out.println(NumeroPrimeiro + " "+"Não é divisível por"+ " " + numeroSegundo);
        } sc.close();
     
    }  

    static void ex8(){
    Scanner sc = new Scanner(System.in);
    
    String[][] perguntas = {
        {"Qual é a capital do Brasil?", "a) São Paulo", "b) Rio de Janeiro", "c) Brasília", "d) Belo Horizonte", "c"},
        {"Quem pintou a Mona Lisa?", "a) Pablo Picasso", "b) Leonardo da Vinci", "c) Vincent van Gogh", "d) Michelangelo", "b"},
        {"Qual é o maior planeta do Sistema Solar?", "a) Marte", "b) Júpiter", "c) Saturno", "d) Vênus", "b"},
        {"Quem escreveu 'Dom Quixote'?", "a) Miguel de Cervantes", "b) William Shakespeare", "c) Franz Kafka", "d) Machado de Assis", "a"},
        {"Qual é o símbolo químico do ouro?", "a) Au", "b) Ag", "c) Fe", "d) Cu", "a"}
         };

        int erros = 0;
        int acertos = 0;
        for (int i = 0; i < perguntas.length; i++) {
            String[] pergunta = perguntas[i];
            System.out.println("Pergunta " + (i + 1) + ": " + pergunta[0]);
            
        for (int j = 1; j < pergunta.length - 1; j++) {
            System.out.println(pergunta[j]);
         }
            System.out.print("Digite a opção correta (a, b, c ou d): ");
           
            String respostaUsuario = sc.nextLine().toLowerCase();
            
            
        if (respostaUsuario.equals(pergunta[pergunta.length - 1])) {
        System.out.println("Resposta correta!\n");
        acertos++;
        } else {
            System.out.println("Resposta incorreta!\n");
            erros++;
            if (erros == 3) {
            System.out.println("Você errou 3 vezes! Fim de jogo.");
             break;
            }
            }
        } if (erros < 3) {
            System.out.println("Parabéns! Você completou o jogo.");
            System.out.println("Número de acertos: " + acertos);
        }sc.close();
    }



}
  



