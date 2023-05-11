package by.practice.help_method.library;

import java.util.Random;
import java.util.Scanner;

public class Help {

	public static int inputValue(String str) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + str + ": ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Введите целое число (цифра): ");
		}

		return sc.nextInt();

	}

	public static double inputDoubleValue(String str) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + str + ": ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите действительное число (цифра): ");
		}

		return sc.nextDouble();

	}

	// заполняет массив случайными целыми числами
	public static int[] fillArray(int count) {
		int[] array;
		Random rnd = new Random();

		array = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = rnd.nextInt(100 + 30) - 30;
		}
		return array;
	}

	// заполняет двумерный массив случайными целыми числами
	public static int[][] fillTwoDimensionalArray(int count) {
		int[][] array;
		Random rnd = new Random();

		array = new int[count][count];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = rnd.nextInt(100);
		}
		return array;
	}

	// заполняет массив случайными действительными числами
	public static double[] fillDoubleArray(int count) {
		double[] array;
		Random rnd = new Random();

		array = new double[count];

		for (int i = 0; i < count; i++) {
			array[i] = rnd.nextDouble(50 + 30) - 30;
		}
		return array;
	}

	// выводит заполненный массив целых чисел
	public static void arrayOutput(int[] array, int count) {
		if (array == null)
			return;
		for (int i = 0; i < count; i++)
			System.out.print(array[i] + " ");

	}

	// выводит заполненный двумерный массив целых чисел
	public static void arrTwoDimencionalOutput(int[][] array, int count) {
		if (array == null)
			return;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	// выводит заполненный массив действительный чисел
	public static void arrayOutput(double[] array, int count) {
		if (array == null)
			return;
		for (int i = 0; i < count; i++)
			System.out.printf("%.01f ", array[i]);

	}
}
