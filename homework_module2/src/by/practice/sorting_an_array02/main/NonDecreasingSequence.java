/*
 * Даны две последовательности a1<=a2<=...<=an и b1<=b 2<=...<=bm. Образовать
 * из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 * */
package by.practice.sorting_an_array02.main;

import by.practice.help_method.library.Help;

public class NonDecreasingSequence {

	public static void main(String[] args) {

		int[] arrSuper = { 2, 3, 3, 5, 8, 0, 0, 0, 0, 0 };
		int[] array = { 1, 6, 7, 9, 9 };
		int temp;

		// объединяем массивы
		for (int i = 0, j = arrSuper.length - array.length; i < array.length; i++, j++) {
			arrSuper[j] = array[i];
		}
		;

		// сортируем согласно условию
		for (int i = 1; i < arrSuper.length; i++) {
			for (int j = 0; j < arrSuper.length; j++) {
				if (arrSuper[i] < arrSuper[j]) {
					temp = arrSuper[i];
					arrSuper[i] = arrSuper[j];
					arrSuper[j] = temp;
				}

			}
		}

		// выводим результат
		System.out.println("Новая последовательность из неубывающих чисел");
		Help.arrayOutput(arrSuper, arrSuper.length);
	}
}
