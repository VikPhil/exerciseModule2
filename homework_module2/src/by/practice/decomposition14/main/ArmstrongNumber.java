/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 * */
package by.practice.decomposition14.main;

import by.practice.help_method.library.Help;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int k;
		k = Help.inputValue("конечное число");

		System.out.println("Числа Армстронга в диапазоне [" + 1 + ", " + k + "]");
		for (int i = 1; i <= k; i++) {
			if (sumOfNumbers(i) == i)
				System.out.print(i + " ");

		}

	}

	/*
	 * Получаем сумму числа в нужной степени
	 */
	public static int sumOfNumbers(int number) {

		int result = 0;
		int temp;
		int degree = degree(number);

		while (number > 0) {
			temp = number % 10;
			result += Math.pow(temp, degree);
			number /= 10;
		}

		return result;
	}

	/*
	 * Вычисляем степень
	 */
	public static int degree(int n) {
		int counter = 0;
		while (n > 0) {
			n /= 10;
			counter++;
		}

		return counter;

	}

}
