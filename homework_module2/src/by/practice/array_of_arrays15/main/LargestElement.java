/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * */
package by.practice.array_of_arrays15.main;

import java.util.Random;

public class LargestElement {

	public static void main(String[] args) {

		int[][] arrNumber = new int[4][5];
		Random r = new Random();
		int max = -1;

		// заполняем числами
		for (int i = 0; i < arrNumber.length; i++) {
			for (int j = 0; j < arrNumber[i].length; j++) {
				arrNumber[i][j] = r.nextInt(10 + 30) - 10;
			}
		}

		// вывод до замены, находим наибольший элемент матрицы
		for (int i = 0; i < arrNumber.length; i++) {
			for (int j = 0; j < arrNumber[i].length; j++) {
				System.out.print(arrNumber[i][j] + " ");
				if (arrNumber[i][j] > max)
					max = arrNumber[i][j];

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("max: " + max);

		// вывод после замены
		for (int i = 0; i < arrNumber.length; i++) {
			for (int j = 0; j < arrNumber[i].length; j++) {
				if (arrNumber[i][j] % 2 == 1 || arrNumber[i][j] % 2 == -1)
					arrNumber[i][j] = max;
				System.out.print(arrNumber[i][j] + " ");

			}
			System.out.println();
		}

	}

}
