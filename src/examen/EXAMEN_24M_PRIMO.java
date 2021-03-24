package examen;

import java.util.Scanner;

public class EXAMEN_24M_PRIMO {
	public static void main(String arg[]) {
		Scanner ent = new Scanner(System.in);
		int num=0;
		
		System.out.println("Buenos días Ceinmark, soy Mario Diaz");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		num=ent.nextInt();
		
		if((num%2)==0 || (num%3)==0||(num%5)==0) {
			
			System.out.println("No es primo");
			System.out.println(num+"%2="+(num%2));
			System.out.println(num+"%3="+(num%3));
			System.out.println(num+"%5="+(num%5));
			
		}else{
			System.out.println("Es primo");
			System.out.println(num+"%2="+(num%2));
			System.out.println(num+"%3="+(num%3));
			System.out.println(num+"%5="+(num%5));
		}
		
	}
}
