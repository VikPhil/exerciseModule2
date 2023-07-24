/* Сортировка вставками.
 * Дана последовательность чисел a1, a2,..., an. Требуется переставить числа в
 * порядке возрастания. Делается это следующим образом. Пусть a1, a2,..., ai -
 * упорядоченная последовательность, т.е. a1<=a2<=...<=an. Берется следующее 
 * число ai+1 и вставляется в последовательность так чтобы новая последователь-
 * ность была тоже возрастающей. Процесс производится до тех пор, пока все 
 * элементы от i+1 до n не будут перебраны. Примечание. Место помещения очередного
 * элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.  
 * */
package by.practice.sorting_an_array05.main;

import by.practice.help_method.library.Help;

public class SortingByInsertion {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int number, r, l;

		arr = Help.fillArray(arr.length);

		/* Реализация обычной сортировки вставками */
//////////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < arr.length - 1; i++) {
			number = arr[i + 1]; // запоминаем след. число по списку
			r = i;
			l = i;
			while (r >= 0) {
				if (number < arr[r]) { // если true
					arr[r + 1] = arr[l]; // переставляем числа в массиве вперед по индексам
					l--; // слева на право, сравнивая каждое с сохраненным числом
				} else
					break;

				r--;
			}
			arr[l + 1] = number; // меньшее число ставим всегда в начало массива
		}
//////////////////////////////////////////////////////////////////////////////		

		/* Двоичный поиск */
		// binary(arr);

		Help.arrayOutput(arr, arr.length);
	}

	/*
	 * Функция двоичного поиска для сортировки
	 */
	public static void binary(int[] array) {

		int number;
		int left, right, half;

		for (int i = 0; i < array.length - 1; i++) {
			number = array[i + 1];
			right = i + 1;
			left = 0;

			while (left <= right) {

				half = (left + right) / 2; // половина диапазона

				if (number > array[half]) { // сдвиг диапазона согласно условию
					left = half + 1; // левый ограничитель

					// перестановка наименьшего(или одинакового) числа в определеном диапазоне
					if (array[left] > number || array[left] == number) {
						for (int j = i + 1; j >= left; j--)
							array[j] = array[j - 1];
						array[left] = number;
					}
				}

				else {
					right = half - 1; // правый ограничитель

					// перестановка в начало самого маленького числа
					if (right < 0) {
						for (int j = i + 1; j >= 1; j--)
							array[j] = array[j - 1];
						array[right + 1] = number;
					}

				}

			}

		}

	}

}
