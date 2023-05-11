/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 * */
package by.practice.decomposition02.main;

import java.util.Scanner;

public class DivisorFour {

	public static void main(String[] args) {

		int a, b, c, d;
		int d2, d3, d4;

		a = inputValue("первое");
		b = inputValue("второе");
		c = inputValue("третье");
		d = inputValue("четвертое");
		
		d2 = greatestDivisor(a, b);
		d3 = greatestDivisor(d2, c);
		d4 = greatestDivisor(d3, d);

		System.out.println("НОД = " + d4);
	}

	public static int inputValue(String str) {

		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + str + " число: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое число (цифра): ");
		}

		value = sc.nextInt();
		return value;

	}

	public static int greatestDivisor(int valueOne, int valueTwo) {

		int divisor = 0;

		if (valueOne == valueTwo)
			divisor = valueOne;

		while (valueOne != valueTwo) {
			if (valueOne > valueTwo) {
				valueOne -= valueTwo;
				divisor = valueOne;
			}

			else if (valueOne < valueTwo) {
				valueTwo -= valueOne;
				divisor = valueTwo;
			}
		}

		return divisor;

	}

}
