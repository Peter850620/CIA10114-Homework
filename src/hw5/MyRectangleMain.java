package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle area1 = new MyRectangle();
		area1.setDepth(10);
		area1.setWidth(20);
		System.out.println(area1.getArea());

		MyRectangle area2 = new MyRectangle(10, 20);
		System.out.println(area2.getArea());
	}
}
