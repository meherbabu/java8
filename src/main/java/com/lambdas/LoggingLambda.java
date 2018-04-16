package com.lambdas;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Java.util.logger API has been modified to include Supplier Functional Interface as one of the parameters to log methods
 * which supports the functional programming paradigm.
 *
 */

public class LoggingLambda {

	public static void main(String[] args) {

		Logger logger = Logger.getAnonymousLogger();
		logger.setLevel(Level.INFO);

		// Here getString() is evaluated first and then passed to the finest()
		// method though its not eligible to log, because the logLevel is set to
		// INFO
		logger.finest(getString());

		// When we use this approch.. before the getString() method gets
		// executed, it will check whether logger can login the message or not.
		logger.finest(() -> getString());

	}

	private static String getString() {
		System.out.println("hello.......");
		return "hi john";
	}

}
