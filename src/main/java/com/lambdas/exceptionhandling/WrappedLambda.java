package com.lambdas.exceptionhandling;

import java.util.function.BiConsumer;

public class WrappedLambda {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int key = 0;

		process(arr, key, lambdaWrapper((i, j) -> System.out.println(i / j)));
	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> lambdaWrapper(BiConsumer<Integer, Integer> consumer) {
		return (i, j) -> {
			try {
				consumer.accept(i, j);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}

}
