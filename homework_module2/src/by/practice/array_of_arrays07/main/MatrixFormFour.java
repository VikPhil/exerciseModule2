/*
 * Сформировать квадратную матрицу порядка N по правилу:
 *	 A[I, J] = sin(I^2 - J^2 / N)
 * и подсчитать количество положительных элементов в ней.
 * */
package by.practice.array_of_arrays07.main;

import by.practice.help_method.library.Help;

public class MatrixFormFour {

	public static void main(String[] args) {
		double[][] matrixForm;
		int size;
		int counter = 0;

		size = Help.inputValue("размер матрицы (четное число)");
		if (size % 2 != 0) {
			System.out.print("Неверные данные");
			return;
		}
		
		matrixForm = new double[size][size];
		
		for(int i = 0; i < matrixForm.length; i++) {
			for(int j = 0; j < matrixForm[i].length; j++) {
				matrixForm[i][j] = Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / size);
				if(matrixForm[i][j] > 0)
					counter++;
			}
		}
		
		Help.doubleTwoDimencionalOutput(matrixForm, size);
		System.out.print("Количество положительных элементов: " + counter);

	}

}
