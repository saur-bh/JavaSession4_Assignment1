/* 
 * FunctionOveridinDemo class extends FunctionOverloadedDemo and over ride functionDemo
 */

package com.acadglid.session4;

public class FunctionOveridingDemo extends FunctionOverloadingDemo {

	//overriding the fucntionDemo

	void functionDemo(int val) {

		System.out.println("I am the overriden functionDemo and have value :" +val);

	}

}
