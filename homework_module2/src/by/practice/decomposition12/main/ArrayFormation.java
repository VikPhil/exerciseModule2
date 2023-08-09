/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 * */
package by.practice.decomposition12.main;

import by.practice.help_method.library.Help;

public class ArrayFormation {

	public static void main(String[] args) {
		int k = 10;
		int n = 60;

		int[] sumArray = new int[size(k, n)];

		fillingArray(sumArray, k, n);

		System.out.println("Сумма цифр равная " + k + " числа не больше " + n);
		Help.arrayOutput(sumArray, sumArray.length);

	}

	/*
	 * Формируем массив по условию
	 */
	public static void fillingArray(int[] arr, int k, int n) {
		int index = 0;

		for (int s = 1; s <= n; s++) {
			if (sumDigits(s) == k) {
				arr[index] = s;
				index++;
			}
		}
	}

	/*
	 * Размер массива
	 */
	public static int size(int k, int n) {
		int size = 0;

		for (int i = 1; i <= n; i++) {
			if (sumDigits(i) == k)
				size++;

		}

		return size;
	}

	/*
	 * Возвращает сумму из цифр
	 */
	public static int sumDigits(int num) {
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
