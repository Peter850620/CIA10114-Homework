package hw4;

public class Item1 {
	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] num = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double avg = 0;
		System.out.print("平均值:");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (i == 9) {
				avg = sum / num.length;
				System.out.println(avg);
			}
		}

		System.out.print("大於平均值的元素:");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > avg) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
