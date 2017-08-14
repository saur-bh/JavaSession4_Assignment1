package com.acadglid.session4;

public class Assignment1 {

	public static void main(String[] args) {

		// Create obj for the functionOverloaded class 

		FunctionOverloadingDemo objDemo = new FunctionOverloadingDemo();


		//Create obj for the functionOverriding class to demo 

		FunctionOveridingDemo objDemo1 = new FunctionOveridingDemo();


		// demo of the overloding which will return String

		String temp= objDemo.functionDemo();

		System.out.println(temp);

		//demo of the overloaded function which take integer 

		objDemo.functionDemo(50);
		//demo of the overloaded function which take String 

		objDemo.functionDemo("IamStringValue");
		
		
		//demo of overiding 
		
		objDemo1.functionDemo(12);

	}

}
