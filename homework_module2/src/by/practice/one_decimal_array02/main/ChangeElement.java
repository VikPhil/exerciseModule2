/* Дана последовательность действительных чисел а1 ,а2 ,..., ап . 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество
 * замен.
 * */
package by.practice.one_decimal_array02.main;

import by.practice.help_method.library.Help;

public class ChangeElement {

	public static void main(String[] args) {

		double number;
		int counter = 0;
		double[] sequence = { -12, 3.2, 54, 2, 8.9, 99, 0.5, -8, 31, 1 };

		System.out.print("Массив до обработки: ");
		Help.arrayOutput(sequence, sequence.length);
		System.out.println();

		number = Help.inputDoubleValue("число");

		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] > number) {
				sequence[i] = number;
				counter++;
			}
		}

		System.out.print("Массив после обработки: ");
		Help.arrayOutput(sequence, sequence.length);
		System.out.println();
		System.out.print("Количество замен: " + counter);

	}

}
