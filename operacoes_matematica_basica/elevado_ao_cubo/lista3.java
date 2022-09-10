/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
        double p = 0;
	    Scanner e=new Scanner(System.in);
	    System.out.println("insira os valores");
	    double n1=e.nextDouble();
	    double n2=e.nextDouble();
	    if (n1>0 && n2>0){
	    p=Math.pow(n1, n2);
	       
	    }else{
	        System.out.println("Erro");
	        System.out.println("insira os valores");
	        n1=e.nextFloat();
	        n2=e.nextFloat();
	    }
	    System.out.println("Resultado = "+p);
	    
	}
}