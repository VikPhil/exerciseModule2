/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1 1 1 ... 1 1 1 |
 * | 0 1 1 ... 1 1 0 |
 * | 0 0 1 ... 1 0 0 |
 * | : : :  X  : : : |
 * | 0 0 1 ... 1 0 0 |
 * | 0 1 1 ... 1 1 0 |
 * | 1 1 1 ... 1 1 1 |
 * */
package by.practice.array_of_arrays06.main;

import by.practice.help_method.library.Help;

public class MatrixFormThree {

	public static void main(String[] args) {
		int[][] matrixForm;
		int size;

		size = Help.inputValue("размер матрицы (четное число)");
		if (size % 2 != 0) {
			System.out.print("Неверные данные");
			return;
		}
		
		matrixForm = new int[size][size];
		int index = size - 1;
		
		for (int i = 0, s = index; i < matrixForm.length / 2; i++, s--) {
			for (int j = i, c = index;j < matrixForm[i].length / 2; j++, c--) {
					matrixForm[i][j] = 1;
					matrixForm[i][c] = 1;
					matrixForm[s][j] = 1;
					matrixForm[s][c] = 1;
			}
			index--;
		}
		
		Help.arrTwoDimencionalOutput(matrixForm, size);
	}

}
