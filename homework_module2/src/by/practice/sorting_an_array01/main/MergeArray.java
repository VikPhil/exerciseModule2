/*
 * Заданы два одномерных массива с различным количеством элементов и
 * натуральное число k. Объединить их в один массив, включив второй массив
 * между k-м и (k+1) - м элементами первого, при этом не используя 
 * дополнительный массив.
 * */
package by.practice.sorting_an_array01.main;

import java.util.Random;
import by.practice.help_method.library.Help;

public class MergeArray {

	public static void main(String[] args) {

		int sizeOne = 6;
		int sizeTwo = 7;
		Random rnd = new Random();

		int point = 3; // точка ввода второго массива

		int[] arrOne = new int[sizeOne + sizeTwo];
		int[] arrTwo = new int[sizeTwo];

		// заполняем оба массива числами
		for (int i = 0; i < sizeOne; i++)
			arrOne[i] = rnd.nextInt(100 + 30) - 30;
		arrTwo = Help.fillArray(sizeTwo);

		System.out.println("Два массива до вставки: ");
		Help.arrayOutput(arrOne, arrOne.length);
		System.out.println();
		Help.arrayOutput(arrTwo, sizeTwo);

		// копируем числа на шаг размера второго массива и от точки ввода вправо
		for (int i = point + 1, j = (i + sizeTwo); j < arrOne.length; i++, j++) {
			arrOne[j] = arrOne[i];
		}

		// вставляем второй массив без потери данных из первого в этот участок
		for (int i = 0, j = point + 1; i < arrTwo.length; i++, j++) {
			arrOne[j] = arrTwo[i];
		}
		System.out.println();

		System.out.println("Массив в массиве: ");
		Help.arrayOutput(arrOne, arrOne.length);

	}

}
