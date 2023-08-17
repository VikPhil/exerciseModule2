/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 * */
package by.practice.decomposition15.main;

public class SequenceSearch {

	public static void main(String[] args) {

		int size = 4;
		int nMax = 9;

		int[] number = new int[size];

		setNumber(number); // Устанавливаем начальные значения в числе

		increasingSequence(number, size, nMax);

	}

	public static void setNumber(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
	}

	public static void numberOutput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}

	public static void increasingSequence(int[] arrNumber, int size, int max) {

		int j = 0;

		while (true) {
			numberOutput(arrNumber); // выводим число
			System.out.println();
			if (arrNumber[size - 1] < max) // увеличиваем последнюю цифру на 1 до 9 вкл.
				arrNumber[size - 1] += 1;
			else {
				for (j = size - 1; j > 0; j--) // цикл устанавливает j в ноль при проходе по всем числам
					if (arrNumber[j] - arrNumber[j - 1] > 1)
						break;
				if (j == 0) // условие выхода из основного цикла
					break;
				arrNumber[j - 1] += 1; // Увеличиваем на 1 предыдущую цифру
				for (int k = j; k < size; k++)
					arrNumber[k] = arrNumber[k - 1] + 1; // сбрасываем последнюю цифру в наименьшую предыдущей плюс 1
			}
		}
	}
}
