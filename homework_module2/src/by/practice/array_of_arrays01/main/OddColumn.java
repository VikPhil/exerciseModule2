/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый 
 * элемент больше последнего.
 * */
package by.practice.array_of_arrays01.main;

public class OddColumn {

	public static void main(String[] args) {
		int[][] matrix = { 
						   { 12, 34, 22, 15},
						   { 33, 9, 7, 16}, 
						   { 50, 8, 72, 89}, 
						   { 100, 32, 19, 76}
						  };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (j % 2 != 0 && (matrix[0][j] > matrix[matrix[i].length - 1][j])) {
					System.out.print(matrix[i][j] + " ");
				}				
			}
			System.out.println();
		}

	}

}
