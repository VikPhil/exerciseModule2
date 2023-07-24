/*
 * Сортировка Шелла.
 * */
package by.practice.sorting_an_array06.main;

import by.practice.help_method.library.Help;

public class ShellSorting {

	public static void main(String[] args) {

		int[] shell = new int[10];
		int step = shell.length / 2;
		int number, index;

		shell = Help.fillArray(shell.length);
		Help.arrayOutput(shell, shell.length);
		System.out.println();

		while (step > 0) { // общий цикл

			for (int i = step; i < shell.length; i++) {
				number = shell[i]; // запоминаем второе число с нужным шагом от первого

				// проверяем больше ли первое число , проходим весь массив в обратку, пока
				// индекс больше шага
				for (index = i; index >= step && shell[index - step] > number; index -= step) {
					shell[index] = shell[index - step];
				}

				shell[index] = number; // ставим (или оставляем) нужное число после прохода

			}

			step /= 2; // после прохода общего цикла уменьшаем шаг в два раза
		}

		Help.arrayOutput(shell, shell.length);

	}

}
