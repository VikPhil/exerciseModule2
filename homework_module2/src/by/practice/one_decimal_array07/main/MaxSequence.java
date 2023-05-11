/*
 * Даны действительные числа a1, a2,..., an . Найти
 * max(a1 + a2n, a2 + a2n−1,..., an + an+1).
 * */
package by.practice.one_decimal_array07.main;

import by.practice.help_method.library.Help;

public class MaxSequence {

	public static void main(String[] args) {

		double[] arrNum = new double[10];
		double maxNumber = 0;

		arrNum = Help.fillDoubleArray(arrNum.length);
		Help.arrayOutput(arrNum, arrNum.length);

		System.out.println();

		for (int i = 0, j = arrNum.length - 1; i < arrNum.length / 2; i++, j--) {
			if (arrNum[i] + arrNum[j] > maxNumber)
				maxNumber = arrNum[i] + arrNum[j];
		}

		System.out.printf("maxNumber = %.01f", maxNumber);
	}

}
