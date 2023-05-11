/*
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, 
 * но больше всех других элементов).
 * */
package by.practice.decomposition05.main;

import java.util.Random;
import java.util.Scanner;

public class SecondNumber {

	public static void main(String[] args) {

		int[] array;
		int arraySize;

		arraySize = inputValue();

		array = new int[arraySize];

		fillArray(array);

		// Выводим массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();

		// Обнуляем максимальное значение массива
		changeArray(array, numberOutput(array));

		System.out.print("Второе максимальное число массива: " + numberOutput(array));

	}

	public static int inputValue() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размер массива: ");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое число (цифра): ");
		}

		return sc.nextInt();
	}

	public static void fillArray(int[] array) {
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
		}

	}

	public static int numberOutput(int[] array) {
		int max;

		max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public static void changeArray(int[] array, int max) {
		for (int i = 0; i < array.length; i++) {
			if (max == array[i]) {
				array[i] = 0;
			}
		}
	}

}
