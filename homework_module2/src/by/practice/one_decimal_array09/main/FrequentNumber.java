/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто 
 * встречающееся число. Если таких чисел несколько, то определить наименьшее 
 * из них.
 * */
package by.practice.one_decimal_array09.main;

public class FrequentNumber {

	public static void main(String[] args) {

		int[] arrayNumber = { 7, 3, 3, 14, 7, 7, 6, 9, 3, 9 };

		int counter = 0;
		int minNumber = arrayNumber[0];
		int maxCounter = 1;

		for (int i = 0; i < arrayNumber.length - 1; i++) {
			for (int j = i + 1; j < arrayNumber.length; j++) {
				if (arrayNumber[i] == arrayNumber[j]) {
					counter++;
				}
				if ((maxCounter == counter) && (minNumber > arrayNumber[i]) || maxCounter < counter) {
					maxCounter = counter;
					minNumber = arrayNumber[i];
				}
			}
			counter = 0;
		}

		System.out.print("Наиболее частое число и наименьшее из таких чисел: " + minNumber);

	}

}
