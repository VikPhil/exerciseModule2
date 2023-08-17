/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * */
package by.practice.decomposition16.main;

import by.practice.help_method.library.Help;

public class OddDigitsInTheNumber {

	public static void main(String[] args) {

		int number;
		number = Math.abs(Help.inputValue("введите число"));
		sumOfNumbers(number);

	}

	/*
	 * Основная функция вычисления по условию задачи
	 */
	public static void sumOfNumbers(int num) {
		int sum = 0;

		if (isOddNumbers(num)) {
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			System.out.println("Сумма цифр числа равна: " + sum);
			System.out.println("Количество четных цифр в данной сумме равно: " + counter(sum));
		} else
			System.out.println("В данном числе присутствует четная цифра!");

	}

	/*
	 * Счетчик четных цифр
	 */
	public static int counter(int sum) {
		int count = 0;
		int t;
		while (sum > 0) {
			t = sum % 10;
			if (t % 2 == 0)
				count++;
			sum /= 10;

		}
		return count;
	}

	/*
	 * Проверяем введеные цифры на нечетность
	 */
	public static boolean isOddNumbers(int number) {

		int temp;
		boolean p = false;

		while (number > 0) {
			p = false;
			temp = number % 10;
			if (temp % 2 == 0)
				break;
			number /= 10;
			p = true;

		}
		return p;
	}

}
