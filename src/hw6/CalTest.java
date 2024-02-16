package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		while (calculator.result) {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			try {
				int x = 0, y = 0;
				System.out.println("請輸入x的值");
				x = sc1.nextInt();
				System.out.println("請輸入y的值");
				y = sc2.nextInt();

				calculator.powerXY(x, y);
				System.out.println(x + "的" + y + "次方等於" + calculator.num);
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("輸入格式不正確");
			}
		}
	}
}
