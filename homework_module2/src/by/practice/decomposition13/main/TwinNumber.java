/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число
 * больше 2. Для решения задачи использовать декомпозицию.
 * */
package by.practice.decomposition13.main;

import by.practice.help_method.library.Help;

public class TwinNumber {

	public static void main(String[] args) {
		int n = 0;

		n = Help.inputValue(" начало отрезка");

		showTheTwins(n);

	}

	public static void showTheTwins(int number) {

		System.out.println("Числа 'близнецы' на отрезке [" + number + "," + number * 2 + "]");
		for (int i = number; i < number * 2 - 1; i++) {
			System.out.print(i + " " + (i + 2));
			System.out.println();

		}
	}

}
