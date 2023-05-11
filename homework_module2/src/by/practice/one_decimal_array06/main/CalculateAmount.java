/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 * */
package by.practice.one_decimal_array06.main;

import by.practice.help_method.library.Help;

public class CalculateAmount {

	public static void main(String[] args) {

		double[] sequence;
		int N = Help.inputValue("размер массива");
		double sum = 0.0;

		sequence = new double[N];
		sequence = Help.fillDoubleArray(N);
		Help.arrayOutput(sequence, N);

		System.out.println();

		for (int i = 1; i < N; i++) {
			int counter = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					counter++;
					break;
				}
			}
			if (counter == 0 && i != 1)
				sum += sequence[i];
		}

		System.out.printf("sum = %.01f ", sum);
	}

}
