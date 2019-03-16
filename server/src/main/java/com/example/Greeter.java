package com.example;

/**
 * This is a class.
 */
public class Greeter {

	/**
	* This is a constructor.
	*/
	public Greeter() {

	}

	/**
	* @param someone El nombre de una persona
	* @return saludo string
	*/
	public final String greet(final String someone) {
	return String.format("Hello, %s!", someone);
	}
}
