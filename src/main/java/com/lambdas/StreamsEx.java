package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamsEx {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person(1, "meher", "kotha"), new Person(2, "lucky", "babu"),
				new Person(3, "manju", "gudisa"));

		// From JDK 1.8
		list.stream().filter(p -> p.getFname().startsWith("m")).forEach(System.out::println);
		
		/*
		 * Till JDK 1.7
		 * 
		 * for (Person p: list){
			if (p.getFname().startsWith("m")){
				System.out.println(p);
			}
		}
		
		*/
	}

}
