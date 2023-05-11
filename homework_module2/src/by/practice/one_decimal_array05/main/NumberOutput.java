/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа,
 * для которых аi > i.
 * */
package by.practice.one_decimal_array05.main;

import by.practice.help_method.library.Help;

public class NumberOutput {

	public static void main(String[] args) {

		int[] array = new int[10];
		array = Help.fillArray(array.length);

		Help.arrayOutput(array, array.length);
		System.out.println();

		System.out.println("Вывод чисел согласно условию: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i)
				System.out.print(array[i] + " ");
		}

	}

}
