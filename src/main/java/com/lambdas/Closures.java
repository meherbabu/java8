package com.lambdas;

/*
 * This code depicts a closure in java. Here Java Compiler freezes the value of b to 10
 * and passes that value to doProcess() function. Till 1.7, we should mark b as final.
 * But from Java 1.8, its optional but if we try to change value of b, compiler is going to complain.
 * 
 */

public class Closures {

	public static void main(String[] args) {

		int b = 10;

		doProcess(1, new Process() {

			@Override
			public void process(int i) {
				System.out.println(i + b);
			}

		});

		doProcess(1, i -> System.out.println(i + b));

	}

	private static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}
