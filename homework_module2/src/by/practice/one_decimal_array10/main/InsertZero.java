/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив
 * из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 * */
package by.practice.one_decimal_array10.main;

import by.practice.help_method.library.Help;

public class InsertZero {

	public static void main(String[] args) {

		int N = Help.inputValue("размер");
		int[] number = new int[N];

		number = Help.fillArray(N);
		Help.arrayOutput(number, N);

		for (int i = 1; i < number.length; i += 2) {
			number[i] = 0;
		}

		System.out.println();
		Help.arrayOutput(number, N);

	}

}
