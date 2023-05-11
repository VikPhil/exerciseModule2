/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * */
package by.practice.array_of_arrays02.main;

import by.practice.help_method.library.Help;

public class DiagonalOutput {

	public static void main(String[] args) {
		int size;
		int[][] array;

		size = Help.inputValue("размер матрицы");
		array = new int[size][size];

		array = Help.fillTwoDimensionalArray(size);
		Help.arrTwoDimencionalOutput(array, size);

		System.out.print("Элементы стоящие по диагонали: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
				}

			}
		}

	}

}
