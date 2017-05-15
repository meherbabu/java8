package com.optum;

public class StringLengthLambdaExpn {

	public static void main(String[] args) {
		StringLength stringLengthLambda = (String s) -> s.length();
		System.out.println(stringLengthLambda.getLength("abcd"));
		
		StringLength stringLengthLambda1 = i -> i.length();
		System.out.println(stringLengthLambda1.getLength("abcd"));
		
		// In-line lambda Expression
		Thread t = new Thread ( () -> System.out.println ("new thread has been created........") );
		
		
	}

}

@FunctionalInterface
interface StringLength{
	int getLength(String str);
	
	default void getLengthDefaultMethod(){ } 
	
	static void getLengthStaticMethod() { }	
}
