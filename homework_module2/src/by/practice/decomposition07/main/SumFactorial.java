/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * */
package by.practice.decomposition07.main;

public class SumFactorial {

	public static void main(String[] args) {

		System.out.println("Сумма равна: ");
		sumFactorial(9);
	}

	public static void sumFactorial(int number) {
		int sum = 0;
		int f = 1;
		for (int i = 1; i <= number; i++) {
			f = f * i;
			if (i % 2 == 0)
				continue;
			sum += f;
		}
		System.out.println(sum);
	}

}
