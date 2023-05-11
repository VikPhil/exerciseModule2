/*
 * Дана последовательность целых чисел a1 , a2 , ... , an . Образовать 
 * новую последовательность, выбросив из исходной те члены, которые равны
 * min( a1 , a2 , ... , an ) .
 * */
package by.practice.one_decimal_array08.main;

import by.practice.help_method.library.Help;

public class NewSequence {

	public static void main(String[] args) {
		int[] before = new int[5];
		int[] after = new int[before.length - 1];
		int minNumber;
		int index = 0;

		before = Help.fillArray(before.length);
		minNumber = before[0];
		System.out.print("Изначальный массив: ");
		Help.arrayOutput(before, before.length);

		for (int i = 0; i < before.length; i++) {
			if (minNumber > before[i]) {
				minNumber = before[i];
				index = i;
			}

		}

		System.out.println();

		for (int j = 0; j < before.length - 1; j++) {
			if (j < index) {
				after[j] = before[j];
			} else
				after[j] = before[j + 1];

		}

		System.out.print("Массив после: ");
		Help.arrayOutput(after, after.length);

	}

}
