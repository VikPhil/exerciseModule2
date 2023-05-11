/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1   1   1  ... 1 1 1 |
 * | 2   2   2  ... 2 2 0 |
 * | 3   3   3  ... 3 0 0 |
 * |... ... ... ... .. ...|
 * |n-1 n-1  0  ... 0 0 0 |
 * | n   0   0  ... 0 0 0 |
 * */
package by.practice.array_of_arrays05.main;

import by.practice.help_method.library.Help;

public class MatrixFormTwo {

	public static void main(String[] args) {
		int[][] matrixForm;
		int size, str;
		int index = 1;

		size = Help.inputValue("размер матрицы (четное число)");
		if (size % 2 != 0) {
			System.out.print("Неверные данные");
			return;
		}

		matrixForm = new int[size][size];
		str = size - 1;

		for (int i = 0; i < matrixForm.length; i++) {
			for (int j = str; j >= 0; j--) {
				matrixForm[i][j] = index;
			}
			str--;
			index++;
		}

		Help.arrTwoDimencionalOutput(matrixForm, size);

	}

}
