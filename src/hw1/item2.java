package hw1;

public class item2 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggs = 200;
		int dozen = 0, piece = 0;
		dozen = eggs / 12;
		piece = eggs % 12;
		System.out.println(dozen + "打");
		System.out.println(piece + "顆");		
	}
}
