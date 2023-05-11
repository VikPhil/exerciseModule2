/*
 *Написать метод(методы) для нахождения наибольшего общего делителя 
 *и наименьшего общего кратного двух натуральных чисел: 
 * */
package by.practice.decomposition01.main;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		int a, b;

		a = inputValue("первое");
		b = inputValue("второе");

		System.out.println("НОД = " + greatestDivisor(a, b));
		System.out.println("НОК = " + smallestMultiple(a, b));
	}

	public static int inputValue(String str) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + str + " число: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое число (цифра): ");
		}

		return sc.nextInt();

	}

	public static int greatestDivisor(int a, int b) {

		int divisor = 0;

		if (a == b)
			divisor = a;

		while (a != b) {
			if (a > b) {
				a -= b;
				divisor = a;
			}

			else if (a < b) {
				b -= a;
				divisor = b;
			}
		}

		return divisor;

	}

	public static int smallestMultiple(int a, int b) {
		return a * b / greatestDivisor(a, b);
	}

}
