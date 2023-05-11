/*
 * Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший
 * и наименьший элементы.
 * */
package by.practice.one_decimal_array04.main;

import by.practice.help_method.library.Help;

public class ChangingElement {

	public static void main(String[] args) {

		double[] arrayNumber;
		int nCount;
		double max, min;
		max = 0;

		nCount = Help.inputValue("размер массива");
		arrayNumber = new double[nCount];

		arrayNumber = Help.fillDoubleArray(nCount);

		System.out.print("Массив до замены: ");
		Help.arrayOutput(arrayNumber, nCount);
		min = arrayNumber[0];

		for (int i = 0; i < arrayNumber.length; i++) {
			if (arrayNumber[i] > max)
				max = arrayNumber[i];
			else if (min > arrayNumber[i])
				min = arrayNumber[i];
		}

		for (int j = 0; j < arrayNumber.length; j++) {
			if (arrayNumber[j] == max)
				arrayNumber[j] = min;
			else if (arrayNumber[j] == min)
				arrayNumber[j] = max;
		}

		System.out.println();
		System.out.print("Массив после замены: ");
		Help.arrayOutput(arrayNumber, nCount);

	}

}
