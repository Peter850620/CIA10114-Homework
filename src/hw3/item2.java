package hw3;

import java.util.Scanner;

public class item2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");

		int ans = (int) (Math.random() * 10);
		while (true) {
			int num1 = sc.nextInt();

			if (num1 != ans) {
				System.out.println("猜錯囉");
			} else {
				System.out.println("答對了!答案就是" + ans);
			}
		}
	}
}
