/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого 
 * являются цифры числа N.
 * */
package by.practice.decomposition10.main;

import by.practice.help_method.library.Help;

public class NumberElement {

	public static void main(String[] args) {
		int number = 32657002;

		int[] numArray = new int[size(number)];
		insertNumber(numArray, number);

		System.out.println("Число: " + number);
		System.out.print("Это число в массиве: ");
		Help.arrayOutput(numArray, numArray.length); // показывает числа в массиве(моя библиотека "Help")
	}

	/*
	 * Функция высчитывает нужный размер массива
	 */
	public static int size(int number) {
		int counter = 0;
		while (number > 0) {
			number /= 10;
			counter++;
		}
		return counter;
	}

	/*
	 * Функция вставляет отдельное число в нужный элемент массива
	 */
	public static void insertNumber(int[] arr, int num) {
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;
		}
	}

}
