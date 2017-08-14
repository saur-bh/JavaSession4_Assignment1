/*
 * Write a program to demonstrate the use of method overloading and method overriding.
 * FunctionOverLoading class will have three function with same name 
 * It differ in parameter passed and return type.
 * 1. functionDemo : takes input as String 
 * 2. functionDemo: takes input as Integer
 * 3. fucntionDemo : returns String value
 * 
 * FunctionOveridinDemo class extends FunctionOverloadedDemo and over ride functionDemo
 */


package com.acadglid.session4;

public class FunctionOverloadingDemo {

	// First function which takes string 

	void functionDemo(String val) {

		System.out.println("I have taken String parameter for the functionDemo i.e. :"+val);
	}


	// Second function which takes integer 

	void functionDemo(int val) {

		System.out.println("I have taken Interger parameter for functionDemo i.e. :"+val);
	}

	// third function which return String

	String functionDemo() {

		return ("I am returned value of functionDemo");
	}


}
