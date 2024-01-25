package hw3;

import java.util.Scanner;

public class item3 {
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= 49; i++) {
			if ((i % 10 == num1) || (i / 10 == num1)) {
				continue;
			}
			count++;
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.print("\n總共有" + count + "數字可選");

	}
}
