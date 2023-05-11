/* 
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, 
 * которые кратны данному К.
 * */
package by.practice.one_decimal_array01.main;

import by.practice.help_method.library.Help;

public class Sum {

	public static void main(String[] args) {
		int[] arrayNumber;
		int value, number;
		int sum = 0;

		value = Help.inputValue("размер массива");

		arrayNumber = new int[value];
		arrayNumber = Help.fillArray(value);

		Help.arrayOutput(arrayNumber, value);
		System.out.println();

		number = Help.inputValue("число");

		System.out.print("Кратные этому числу: ");
		for (int i = 0; i < value; i++) {
			if (arrayNumber[i] % number == 0) {
				System.out.print(arrayNumber[i] + " ");
				sum += arrayNumber[i];
			}
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}

}
