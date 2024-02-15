package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

public class Item1 {

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("輸入寬:");
		int width = sc1.nextInt();
		System.out.println("輸入高:");
		int height = sc2.nextInt();

		starSquare(width, height);

		sc1.close();
		sc2.close();

	}
}
