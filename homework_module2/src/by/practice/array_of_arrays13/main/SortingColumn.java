/*
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * */
package by.practice.array_of_arrays13.main;

import by.practice.help_method.library.Help;

public class SortingColumn {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		arr = Help.fillTwoDimensionalArray(arr.length);
		Help.arrTwoDimencionalOutput(arr, arr.length);

		sortAscending(arr);

		System.out.println("Отсортирован по возрастанию.");
		Help.arrTwoDimencionalOutput(arr, arr.length);

		sortDescending(arr);

		System.out.println("Отсортирован по убыванию.");
		Help.arrTwoDimencionalOutput(arr, arr.length);

	}
	
	// сортировка по убыванию
		public static void sortDescending(int[][] array) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					for (int m = 0; m < array[i].length; m++) {
						if (array[j][i] > array[m][i])
							change(array, i, j, m);
					}
				}
			}
		}

		// сортировка по возрастанию
		public static void sortAscending(int[][] array) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					for (int m = 0; m < array[i].length; m++) {
						if (array[j][i] < array[m][i])
							change(array, i, j, m);
					}
				}
			}
		}

		// меняет местами элементы массива
		public static void change(int[][] array, int i, int a, int b) {
			int temp;
			temp = array[a][i];
			array[a][i] = array[b][i];
			array[b][i] = temp;
		}


}
