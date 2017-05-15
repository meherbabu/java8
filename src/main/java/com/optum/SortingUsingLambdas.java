// This class sorts a collection of elements using Lambda Expressions and also uses the default Predicate Functional interface provided in Java

package com.optum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class SortingUsingLambdas {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person(1, "meher", "kotha"), new Person(2, "lucky", "babu"),
				new Person(3, "manju", "gudisa"));

		Collections.sort(list, (o1, o2) -> o1.getLname().compareTo(o2.getLname()));

		printConditionally(list, p -> true);

		printConditionally(list, p -> p.getFname().startsWith("m"));

	}

	private static void printConditionally(List<Person> list, Predicate<Person> f) {
		for (Person p : list) {
			if (f.test(p)) {
				System.out.println(p);
			}
		}

		list.forEach(p -> {
			if (f.test(p)) {
				System.out.println(p);
			}
		});

	}
}

/*interface Condition {
	boolean test(Person p);
}*/
