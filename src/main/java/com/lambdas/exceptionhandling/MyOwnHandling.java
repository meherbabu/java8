package com.lambdas.exceptionhandling;

import java.util.function.BiConsumer;

public class MyOwnHandling {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int key = 2;

		process(arr, key, (i, j) -> handleException(i, j));
	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}

	private static void handleException(Integer i, Integer j) {
		try {
			System.out.println(i / j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
