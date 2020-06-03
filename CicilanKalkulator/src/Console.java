package CicilanKalkulator.src;

import java.util.Scanner;

public class Console {

	static Scanner scanner = new Scanner(System.in);

	public static double readInputNumber(String message) {
		System.out.print(message);
		return scanner.nextDouble();
	}

	public static double readInputNumber(String message, double minValue, double maxValue) {
		while (true) {
			System.out.print(message);
			double input = scanner.nextDouble();

			if (input >= minValue && input <= maxValue) {
				return input;
			}
			System.out.println("Input harus diantara " + minValue + " - " + maxValue);
		}
	}

	public static double readInputNumber(String message, double minValue) {
		while (true) {
			System.out.print(message);
			double input = scanner.nextDouble();

			if (input >= minValue) {
				return input;
			}
			System.out.println("Input minimal adalah  " + minValue);
		}
	}

}