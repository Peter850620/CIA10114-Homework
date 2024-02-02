package hw4;

import java.util.Scanner;

public class Item5 {
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		boolean condition = true;
		int days = 0;
		int[][] date = { { 1, 31 }, { 2, 28 }, { 3, 31 }, { 4, 30 }, { 5, 31 }, { 6, 30 }, { 7, 31 }, { 8, 31 },
				{ 9, 30 }, { 10, 31 }, { 11, 30 }, { 12, 31 } };
		while (condition) {
			System.out.println("請輸入西元年");
			int yy = sc1.nextInt();
			System.out.println("請輸入月份");
			int mm = sc2.nextInt();
			System.out.println("請輸入日期");
			int dd = sc3.nextInt();

			if (mm > 0 && mm <= 12) {
				if (yy % 400 == 0 && yy % 100 != 0) {
					if (dd > date[mm - 1][1]) {
						System.out.println("西元" + yy + "年" + mm + "月只有" + date[mm - 1][1] + "天，請重新輸入");
						continue;
					}
				} else {
					if (dd > date[mm - 1][1] && (mm == 2 && dd > date[mm - 1][1] + 1)) {
						System.out.println("西元" + yy + "年" + mm + "月只有" + (date[mm - 1][1] + 1) + "天，請重新輸入");
						continue;
					}
				}

			} else {
				System.out.println("輸入錯誤的月份，請重新輸入");
				continue;
			}
			if (!(yy % 400 == 0 && yy % 100 != 0)) {
				days++;
			}
			for (int i = 0; i < mm - 1; i++) {
				days += date[i][1];
			}
			days = days + dd;
			break;
		}
		System.out.println("輸入的日期為該年第" + days + "天");
	}
}
