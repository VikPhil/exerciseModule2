/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * */
package by.practice.decomposition06.main;

import by.practice.help_method.library.Help;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num1, num2, num3;

		num1 = Help.inputValue("первое число");
		num2 = Help.inputValue("второе число");
		num3 = Help.inputValue("третье число");

		if (isMutuallySimple(num1, num2, num3)) {
			System.out.print("Числа: " + num1 + " " + num2 + " " + num3);
			System.out.print(" - взаимно простые.");
		} else {
			System.out.print("Числа: " + num1 + " " + num2 + " " + num3);
			System.out.print(" - (He)взаимно простые.");
		}

	}

	public static boolean isMutuallySimple(int n1, int n2, int n3) {

		int d = greatestDivisor(n1, n2);
		int divisor = greatestDivisor(d, n2);

		if (divisor == 1) {
			System.out.println("Наибольший общий делитель равен 1 или -1");
			return true;
		} else {
			System.out.println("Наибольший общий делитель не равен 1");
			return false;
		}
	}

	public static int greatestDivisor(int a, int b) {

		int divisor = 0;

		if (a == b)
			divisor = a;

		while (a != b) {
			if (a > b) {
				a -= b;
				divisor = a;
			}

			else if (a < b) {
				b -= a;
				divisor = b;
			}
		}

		return divisor;

	}

}
