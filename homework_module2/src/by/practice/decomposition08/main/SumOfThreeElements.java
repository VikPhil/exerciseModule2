/*
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
   Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
   массива с номерами от k до m.
 * */
package by.practice.decomposition08.main;

import by.practice.help_method.library.Help;

public class SumOfThreeElements {

	public static void main(String[] args) {
		int k, m;
		k = 2; // Начало границы
		m = 9; // Конец границы
		int[] dArray = new int[m];

		dArray = Help.fillArray(dArray.length);
		Help.arrayOutput(dArray, dArray.length);

		System.out.println();

		for (int i = k; i < dArray.length - 1; i += 2) {
			for (int j = i; j < i + 3; j++)
				System.out.print("[" + j + "]");
			System.out.print(":");
			System.out.println("Сумма этих трех элементов равна: " + sumElement(dArray, i));
		}

	}

	// Функция суммирует последовательно числа по условию задания
	public static int sumElement(int[] array, int n) {
		return array[n] + array[n + 1] + array[n + 2];
	}

}
