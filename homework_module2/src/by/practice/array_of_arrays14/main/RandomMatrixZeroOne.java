/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем 
 * в каждом столбце число единиц равно номеру столбца.
 * */
package by.practice.array_of_arrays14.main;

import java.util.Random;

import by.practice.help_method.library.Help;

public class RandomMatrixZeroOne {

	public static void main(String[] args) {

		int[][] randomMatrix;
		int str, column;
		Random r = new Random();

		boolean flag = false;

		//задаем ограничение ввода
		do {
			str = Help.inputValue("количество строк матрицы");
			column = Help.inputValue("количество колонок матрицы");

			if (column > str + 1) {
				System.out.println("Количество колонок не должно превышать количество строк болee чем на одну!");
			} else
				flag = true;

		} while (flag == false);

		randomMatrix = new int[str][column];

		// заполняем рандомно единицами
		for (int n = 0; n < column; n++) {
			for (int k = 0; k < n; k++) {

				int last = r.nextInt(column-1);
				if (randomMatrix[last][n] == 1) { // если индекс повторяется, откатываемся и проходим еще раз
					k--;
					continue;
				} else {
					randomMatrix[last][n] = 1;
				}

			}

		}

		for (int i = 0; i < str; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(randomMatrix[i][j]);
			}
			System.out.println();
		}

	}

}
