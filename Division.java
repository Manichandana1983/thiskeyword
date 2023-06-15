package com.tmf;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Division {
	public static void main(String[] args)throws IOException{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int a=obj.nextInt();
		int b=obj.nextInt();
		Arithmetics ar=new Arithmetics(a,b);
		
		
		ar.add();
		ar.sub();
		ar.div();
		ar.mul();
		
	}

}
