package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {

		String[] arr = { "abcd", "1234", "john" };
		// printConditionally(arr, i -> System.out.println(i));

		// printConditionally(arr, System.out::println);

		Collections.sort(Arrays.asList(arr), (o1, o2) -> compare(o1, o2));
		// printConditionally(arr, System.out::println);

		Collections.sort(Arrays.asList(arr), MethodReference::compare);
		printConditionally(arr, System.out::println);
	}

	static void printConditionally(String[] arr, Consumer<String> consumer) {
		for (String i : arr) {
			consumer.accept(i);
		}

	}

	private static int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
