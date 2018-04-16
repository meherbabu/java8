package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) throws InterruptedException {
		String[] arr = { "abcd", "1234", "john" };
		List<String> list = Arrays.asList(arr);

		list.forEach(p -> System.out.println(p));

		list.forEach(System.out::println);

	}

}
