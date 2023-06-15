/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
 * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 * */
package by.practice.array_of_arrays11.main;

import by.practice.help_method.library.Help;

public class SearchFive {

	public static void main(String[] args) {
		int[][] matrix = new int[10][20];
		int counter;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = (int) (Math.random() * 16);

		}

		Help.arrTwoDimencionalOutput(matrix, matrix.length);
		System.out.println();
		System.out.println("Три и больше пятерок в строках: ");

		for (int i = 0; i < matrix.length; i++) {
			counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 5) {
					counter++;

				}
			}
			if (counter >= 3)
				System.out.println("str: " + i);

		}
	}

}
