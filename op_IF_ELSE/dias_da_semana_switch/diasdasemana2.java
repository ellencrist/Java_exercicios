package javaapplication6;
import java.util.*;
import java.util.Scanner;

public class newJavaFile6 {
    public static void main(String args[]) {
         int diaSemana, resp;
        
        Scanner imput = new Scanner(System.in);
        //looping
        do{
       System.out.print("Digite o dia da Semana: ");
       diaSemana = imput.nextInt();
       resp=0;
      
       switch(diaSemana){
           case 1 -> System.out.println("Domingo");
           case 2 -> System.out.println("Segunda");
           case 3 -> System.out.println("Terça");
           case 4 -> System.out.println("Quarta");
           case 5 -> System.out.println("Quinta");
           case 6 -> System.out.println("Sexta");
           case 7 -> System.out.println("Sabádo");
           default -> System.out.println("Número inválido fornecido, use números de 1 até 7");
       }
       
        resp=imput.nextInt();
        }while(resp!=0);
        imput.close();
    }
}