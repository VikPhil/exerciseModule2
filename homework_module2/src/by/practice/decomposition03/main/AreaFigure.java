/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя
 * метод вычисления площади треугольника.
 * */
package by.practice.decomposition03.main;

import java.util.Scanner;

public class AreaFigure {

	public static void main(String[] args) {

		double a, area;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сторону шестиугольника: ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите число (цифра): ");
		}
		a = sc.nextDouble();

		area = 6 * areaOfTriangle(a);
		System.out.print("Площадь шестиугольника равна: " + area);

	}

	public static double areaOfTriangle(double value) {

		return Math.sqrt(3) / 4 * Math.pow(value, 2);
	}

}
