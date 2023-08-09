/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), 
 * определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив.
 * 
 * d = \sqrt{[(x_2 - x_1) ^ 2 +(y_2 - y_1) ^ 2]}
 * */
package by.practice.decomposition04.main;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Random;

public class MaxSegment {

	public static void main(String[] args) {

		int nCount = 4; // количество точек
		int size = 5;
		int countCoord = 0;
		char[][] area = new char[size][size];
		int[][] coord = new int[nCount][2]; // координаты точек
		Random rand = new Random();
		
		int perRandX, perRandY;
		int lastRandX = rand.nextInt(size);
		int lastRandY = rand.nextInt(size);

		// Распологаем точки на плоскости(цикл без повтора координат(почти)) ))
		while (nCount > 0) {
			perRandX = rand.nextInt(size);
			perRandY = rand.nextInt(size);
			if (perRandX == lastRandX && perRandY == lastRandY)
				continue;
			else {
				area[perRandY][perRandX] = '*';
				coord[countCoord][0] = perRandX; // сохраняем координаты X в массив
				coord[countCoord++][1] = perRandY; // сохраняем координаты Y в массив
			}
				
			lastRandX = perRandX;
			lastRandY = perRandY;
			nCount--;
		}
		
		// Выводим матрицу с точками
		display(area);
		
		// Вывод координат точек с наибольшим отрезком
		maxDistance(coord);
			
	}
	
	public static void display(char[][] area) {
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				if (area[i][j] != '*')
					area[i][j] = 'n';
				System.out.print(area[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void maxDistance(int[][] coord) {
		int xCoor;
		int yCoor;
		int pX1 = 0, pX2 = 0, pY1 = 0, pY2 = 0;
		double maxDis = 0.0;
		double d;
		
		
		for(int i = 0; i < coord.length; i++) {
			for(int j = 1; j < coord.length; j++) {
				xCoor = coord[j][0] - coord[i][0];
				yCoor = coord[j][1] - coord[i][1];
				d = sqrt(pow(xCoor, 2) + pow(yCoor, 2)); // Формула вычисления длины отрезка между точками
				if(d > maxDis) {                         // Находим наибольший отрезок...
					maxDis = d;
					pX1 = coord[i][0];					 //...и заносим координаты этих точек в массив				
					pX2 = coord[j][0];
					pY1 = coord[i][1];
					pY2 = coord[j][1];
				}
			}
		}
		int[] pointCoor = {pX1, pY1, pX2, pY2};
		
		System.out.println("Point 1: [" + pointCoor[0] + " , " + pointCoor[1] + "] ");
		System.out.println("Point 2: [" + pointCoor[2] + " , " + pointCoor[3] + "] ");
	
	}

}
