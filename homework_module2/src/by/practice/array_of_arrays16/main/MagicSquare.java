/*
 * Магическим квадратом порядка n называется квадратная матрица размера n x n,
 * составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат. Пример магического квадрата порядка 3:
 * 		6 1 8		
 * 		7 5 3		
 * 		2 9 4
 * */
package by.practice.array_of_arrays16.main;

import by.practice.help_method.library.Help;

public class MagicSquare {

	public static void main(String[] args) {

		int size = 5;
		int[][] magicArr = new int[size][size];
		int up = 0, right = size / 2;
		int oldUp = 0, oldRight = 0;

		final int minConst = size * ((int) Math.pow(size, 2) + 1) / 2;

		System.out.println("Минимальная константа: " + minConst);

		magicArr[up][right] = 1;

		for (int i = 0; i < size * size - 1; i++) {

			oldUp = up;
			oldRight = right;

			up = stepUp(up);
			right = stepRight(right);

			if (up < 0) {
				up = size - 1;
			}

			if (right > size - 1) {
				right = 0;
			}

			if (magicArr[up][right] != 0) {
				up = oldUp + 1;
				right = oldRight;
			}

			magicArr[up][right] = i + 2;
		}

		Help.arrTwoDimencionalOutput(magicArr, size);

	}

	// шаг вверх
	public static int stepUp(int up) {
		return --up;
	}

	// шаг вправо
	public static int stepRight(int right) {
		return ++right;
	}

}
