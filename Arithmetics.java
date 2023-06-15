package com.tmf;
public class Arithmetics {
	private int a;
	private int b;
	public Arithmetics() {
		System.out.println("Constructor was called");
		}
	public Arithmetics(int a,int b) {
		System.out.println("parameterized constuctor was called");
		this.a= a;
		this.b= b;
	}
	public void add() {
		System.out.println(a +"+" +b+ " = " +(a+b));
	}
	public void sub() {
		System.out.println(a +"-" +b+ " = " +(a-b));
	}
	public void div() {
		System.out.println(a +"/" +b+ " = " +(a/b));
	}
	public void mul() {
		System.out.println(a +"*" +b+ " = " +(a*b));
	}
	
	}


