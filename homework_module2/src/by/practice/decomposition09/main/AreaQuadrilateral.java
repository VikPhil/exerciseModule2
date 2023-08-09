/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 * */
package by.practice.decomposition09.main;

public class AreaQuadrilateral {

	public static void main(String[] args) {
		double x = 10, y = 15, z = 10, t = 15;

		double areaQuadrilateral; // площадь находим путем сложения площадей треугольников

		areaQuadrilateral = areaRightTriangle(x, y) + areaTriangle(z, t, x, y);

		System.out.printf("Площадь четырехугольника равна: %.2f", areaQuadrilateral);

	}

	/*
	 * Площадь обычного треугольника через полупериметр
	 */
	public static double areaTriangle(double z, double t, double x, double y) {
		double perimeter;
		double area;

		perimeter = 0.5 * (z + t + hypotenuse(x, y));
		area = Math.sqrt(perimeter * (perimeter - z) * (perimeter - t) * (perimeter - hypotenuse(x, y)));

		return area;
	}

	/*
	 * Площадь прямоугольного треугольника
	 */
	public static double areaRightTriangle(double x, double y) {
		return x * y / 2;
	}

	/*
	 * Гипотенуза треугольников для нахождения площади второго треугольника
	 */
	public static double hypotenuse(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}
