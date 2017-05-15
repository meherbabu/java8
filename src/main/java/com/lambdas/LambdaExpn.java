package com.lambdas;
// This class provides a new custom Functional interface and a lambda expression using that interface

public class LambdaExpn {
	public static void main(String[] args) {

		MyLambda myLambdaClass = new MyLambdaClass();
		myLambdaClass.foo();

		MyLambda myLambdaFunction = () -> System.out.println("Lambda Expression of type MyLambda interface...");
		myLambdaFunction.foo();

	}
}

interface MyLambda {
	void foo();
}

class MyLambdaClass implements MyLambda {
	public void foo() {
		System.out.println("An instance of class implementing MyLambda Interface");
	}
}
