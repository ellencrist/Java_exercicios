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
	    double x,q,c,r,rc;
	    Scanner e=new Scanner(System.in);
	    System.out.println("insira o número");
	    x= e.nextDouble();
	    q= x*x;
	    c= x*x*x;
	    r=Math.sqrt(x);
	    rc=Math.cbrt(x);
	    System.out.println("quadrado = "+q);
	    System.out.println("cubo"+c);
	    System.out.println("raiz = "+r);
	    System.out.println("raiz cubica = "+rc);
	    
	}
}