/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * */
package by.practice.decomposition11.main;

public class MoreQuantity {

	public static void main(String[] args) {
		int numOne = 90394;
		int numTwo = 887320;

		System.out.println("Числа " + numOne + " и " + numTwo);
		maximumOfDigits(numOne, numTwo);

	}

	public static int quantity(int number) {
		int counter = 0;
		while (number > 0) {
			number /= 10;
			counter++;
		}
		return counter;
	}

	public static void maximumOfDigits(int numOne, int numTwo) {

		if (quantity(numOne) > quantity(numTwo))
			System.out.println("Больше всего цифр в числе: " + numOne);
		else if (quantity(numOne) == quantity(numTwo))
			System.out.println("Количество цифр равно в обоих числах.");
		else
			System.out.println("Больше всего цифр в числе: " + numTwo);
	}

}
