package com.AccessModifiers.Examples;

public class C_04_Public extends B {

	public static void main(String[] args) {
		
		C_04_Public obj = new C_04_Public();
		int output = obj.x;
		System.out.println("Value is x is: " + output);
		obj.b1();

	}
}
