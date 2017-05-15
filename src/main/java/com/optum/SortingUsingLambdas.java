// This class sorts a collection of elements using Lambda Expressions and also uses the default Predicate Functional interface provided in Java

package com.optum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdas.Person;

public class SortingUsingLambdas {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person(1, "john", "kite"), new Person(2, "kite", "john"),
				new Person(3, "jane", "doe"));

		Collections.sort(list, (o1, o2) -> o1.getLname().compareTo(o2.getLname()));

		printConditionally(list, p -> true, p -> System.out.println(p));

		printConditionally(list, p -> p.getFname().startsWith("m"), p -> System.out.println(p));

	}

	private static void printConditionally(List<Person> list, Predicate<Person> f, Consumer<Person> c) {
		list.forEach(p -> {
			if (f.test(p)) {
				c.accept(p);
			}
		});
	}
}

/*
 * interface Condition { boolean test(Person p); }
 */
