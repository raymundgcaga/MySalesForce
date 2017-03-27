package com.accenture.mysalesforce;

import java.awt.DisplayMode;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
		
	}

	private static void displayGreeting() {
		System.out.println("Hi");
		System.out.println("Hellow");
	}
}
