/*Elaborado por: Brayan Gutierrez Oropeza*/
package com.brayan.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número natural");
		Scanner read=new Scanner(System.in);
		num=read.nextInt();
		System.out.println("El limite es " + num);
		
		for(int i=1; i<=num; i++) {
			if((i%3==0) &&(i%5==0)) {
				System.out.print("FizzBuzz ");
			}else if(i%3 == 0 ) {
				System.out.print("Fizz ");
			}else if(i%5==0){
				System.out.print("Buzz ");
			}else {
				System.out.print(i+" ");
			}
		}
	}	
}
