/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
 * в нем отрицательных, положительных и нулевых элементов.
 * */
package by.practice.one_decimal_array03.main;

import by.practice.help_method.library.Help;

public class ItemCounter {

	public static void main(String[] args) {

		double[] number = { -3, 0, 0, 13, 3.2, -16, -44, 0, 5, 100, -1, 0, 22, 0 };

		int zero, negative, positive;
		zero = 0;
		negative = 0;
		positive = 0;

		System.out.print("Массив: ");
		Help.arrayOutput(number, number.length);

		for (int i = 0; i < number.length; i++) {
			if (number[i] == 0)
				zero++;
			else if (number[i] < 0)
				negative++;
			else if (number[i] > 0)
				positive++;
		}
		System.out.println();
		System.out.println("Нулевых равно: " + zero);
		System.out.println("Отрицательных равно: " + negative);
		System.out.println("Положительных равно: " + positive);

	}

}
