/*
 * Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an. Требуется
 * переставить числа в порядке возрастания. Для этого сравниваются два соседних
 * числа ai и ai+1. Если ai > ai+1, то делается перестановка. Так продолжается
 * до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * */
package by.practice.sorting_an_array04.main;

import by.practice.help_method.library.Help;

public class SortingByExchange {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		int temp;
		int count = 0;
		
		numbers = Help.fillArray(numbers.length);

		Help.arrayOutput(numbers, numbers.length);
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					count++;
				}
			}
		}

		Help.arrayOutput(numbers, numbers.length);
		System.out.println();
		System.out.print("Count = " + count);

	}

}
