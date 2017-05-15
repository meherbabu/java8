package com.lambdas;

public class ThisReference {

	public void process(int i, Process p) {
		System.out.println("Outer Reference...              " + this);
		p.process(i);
	}

	public void execute() {
		process(1, i -> {
			System.out.println(i);
			System.out.println("this in Lambda pointed to outer Reference... " + this);
		});
	}

	public static void main(String[] args) {
		ThisReference thisReference = new ThisReference();
		thisReference.process(1, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Anonymous inner class Reference " + this);
			}

		});

		thisReference.execute();
	}

}
