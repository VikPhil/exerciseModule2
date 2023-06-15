/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 * */
package by.practice.array_of_arrays10.main;

import java.util.Random;

import by.practice.help_method.library.Help;

public class PositiveElement {

	public static void main(String[] args) {
		int[][] elements = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				elements[i][j] = rand.nextInt(11 + 10) - 10; //[-10 , 10]
			}
		}

		Help.arrTwoDimencionalOutput(elements, elements.length);

		System.out.print("Положительный элемент главной диагонали: ");
		
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (i == j) {
					if (elements[i][j] > 0)
						System.out.print(elements[i][j] + " ");
				}
			}
		}

	}

}
