package hw3;

import java.util.Scanner;

public class item1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("請輸入三個整數:");
		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		int num3 = sc3.nextInt();

		if (num1 + num2 <= num3 || num1 + num3 <= num2 || num2 + num3 <= num1 || num1 == 0 || num2 == 0 || num3 == 0) {
			System.out.println("不是三角形");
		} else if ( Math.pow(num2, 2) + Math.pow(num1, 2) == Math.pow(num3, 2) || Math.pow(num1, 2) + Math.pow(num3, 2) == Math.pow(num2, 2) || Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2) ) {
			System.out.println("直角三角形");
		}  else if (num1 == num2 && num1 == num3) {
			System.out.println("正三角形");
		} else if ((num1 == num2 && num1 != num3) || (num1 == num3 && num1 != num2) || (num1 == num3 && num1 != num2)) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
	}
}
