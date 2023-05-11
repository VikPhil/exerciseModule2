/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1  2   3  ... n |
 * | n n-1 n-2 ... 1 |
 * | 1  2   3  ... n |
 * | n n-1 n-2 ... 1 |
 * | 1  2   3  ... n |
 * */
package by.practice.array_of_arrays04.main;

import by.practice.help_method.library.Help;

public class MatrixFormOne {

	public static void main(String[] args) {
		int[][] matrixForm;
		int size;
		int index = 0;

		size = Help.inputValue("размер матрицы (четное число)");
		if (size % 2 != 0) {
			System.out.print("Неверные данные");
			return;
		}

		matrixForm = new int[size][size];

		for (int i = 0; i < matrixForm.length; i++) {
			for (int j = 1; j <= matrixForm[i].length; j++) {
				if (i % 2 != 0) {
					index = 0;
					for (int k = matrixForm.length; k > 0; k--) {
						matrixForm[i][index] = k;
						index++;
					}
					index = 0;
				} else {
					matrixForm[i][index] = j;
					index++;
				}

			}
		}
		Help.arrTwoDimencionalOutput(matrixForm, size);

	}

}
