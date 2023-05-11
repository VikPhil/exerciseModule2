/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * */
package by.practice.array_of_arrays03.main;

import by.practice.help_method.library.Help;

public class RowAndColumn {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int k, p;

		array = Help.fillTwoDimensionalArray(array.length);
		Help.arrTwoDimencionalOutput(array, array.length);

		k = Help.inputValue("номер строки от 0 до 4");
		p = Help.inputValue("номер столбца от 0 до 4");

		System.out.print("Строка: ");
		for (int i = 0; i < array[k].length; i++)
			System.out.print(array[k][i] + " ");

		System.out.println();

		System.out.print("Столбец: ");
		for (int j = 0; j < array[p].length; j++)
			System.out.print(array[j][p] + " ");

	}

}
