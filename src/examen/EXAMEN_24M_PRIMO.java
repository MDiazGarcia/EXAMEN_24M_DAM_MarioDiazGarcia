package examen;

import java.util.Scanner;

public class EXAMEN_24M_PRIMO {
	public static void main(String arg[]) {
		Scanner ent = new Scanner(System.in);
		int num=0;
		
		System.out.println("Buenos días Ceinmark, soy Mario Diaz");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		num=ent.nextInt();
		
		if((num%2)==1 || (num%3)==1||(num%5)==1) {
			
			System.out.println("no es primo");
			System.out.println(num+"%2="+(num%2));
			System.out.println(num+"%3="+(num%3));
			System.out.println(num+"%5="+(num%5));
			
		}
		
	}
}
