/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
 * элементы одного столбца поставить на соответствующие им позиции другого, 
 * а его элементы второго переместить в первый. Номера столбцов вводит 
 * пользователь с клавиатуры.
 * */
package by.practice.array_of_arrays08.main;

import by.practice.help_method.library.Help;

public class ChangeColumn {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		int number;
		int column1, column2;

		array = Help.fillTwoDimensionalArray(array.length);
		Help.arrTwoDimencionalOutput(array, array.length);

		column1 = Help.inputValue("номер первой колонки (0 - 3)");
		column2 = Help.inputValue("номер второй колонки не равной первой (0 - 3)");

		// Проверка ввода данных
		if (column1 == column2 || column1 > array.length - 1 || column1 < 0 || column2 > array.length - 1
				|| column2 < 0) {
			System.out.println("Вы ввели неверные данные.");
			return;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == column1) {
					number = array[i][column2];
					array[i][column2] = array[i][j];
					array[i][j] = number;
				}

			}

		}

		Help.arrTwoDimencionalOutput(array, array.length);

	}

}
