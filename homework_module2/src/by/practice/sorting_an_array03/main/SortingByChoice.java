/*
 * Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого
 * в массиве, начиная с первого, выбирается наибольший элемент и ставится на 
 * первое место, а первый - на место наибольшего. Затем, начиная со второго, 
 * эта процедура повторяется. Написать алгоритм сортировки выбором.
 * */
package by.practice.sorting_an_array03.main;

import by.practice.help_method.library.Help;

public class SortingByChoice {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };

		int max, index;

		for (int i = 0; i < array.length - 1; i++) {
			max = array[i];
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = max;
		}

		Help.arrayOutput(array, array.length);

	}

}
