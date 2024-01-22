package hw1;

public class item4 {
	public static void main(String[] args) {
//		 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double circleArea = 0;
		double circumference = 0;
		circleArea = 5 * 5 * PI;
		circumference = 10 * PI;
		System.out.println("圓面積:" + circleArea);
		System.out.println("圓周長:" + circumference);
	}
}
