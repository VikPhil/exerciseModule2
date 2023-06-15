/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
 * столбце. Определить, какой столбец содержит максимальную сумму.
 * */
package by.practice.array_of_arrays09.main;

import by.practice.help_method.library.Help;

public class MaximumAmount {

	public static void main(String[] args) {

		int[][] arbitraryNumbers = new int[3][3];
		int[] sumNumbers = new int[arbitraryNumbers.length]; // массив для хранения суммы каждого столбца
		int column = 0, maxNumber = 0;

		arbitraryNumbers = Help.fillTwoDimensionalArray(arbitraryNumbers.length);
		Help.arrTwoDimencionalOutput(arbitraryNumbers, arbitraryNumbers.length);

		for (int i = 0; i < arbitraryNumbers.length; i++) {
			for (int j = 0; j < arbitraryNumbers[i].length; j++) {
				sumNumbers[i] += arbitraryNumbers[j][i];

			}
		
			if (maxNumber < sumNumbers[i]) {
				maxNumber = sumNumbers[i];
				column = i;
			}
		}

		Help.arrayOutput(sumNumbers, sumNumbers.length);
		System.out.println();
		System.out.println("Максимальную сумму содержит столбец: " + column);

	}
}
