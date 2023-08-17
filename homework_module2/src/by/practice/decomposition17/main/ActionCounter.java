/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 * */
package by.practice.decomposition17.main;

import by.practice.help_method.library.Help;

public class ActionCounter {

	public static void main(String[] args) {

		int number;
		number = Math.abs(Help.inputValue("введите число"));

		System.out.println("Итого количество действий равно: " + numberOfActions(number));

	}

	/*
	 * Счетчик действий
	 */
	public static int numberOfActions(int num) {
		int counter = 0;

		do {
			System.out.print(num + " - " + sumOfNumbers(num));
			num -= sumOfNumbers(num);
			System.out.println(" = " + num);
			counter++;
		} while (num > 0);

		return counter;
	}

	/*
	 * Вычисляет сумму цифр
	 */
	public static int sumOfNumbers(int num) {

		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
