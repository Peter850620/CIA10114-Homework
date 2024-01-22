package hw2;

public class item7 {
	public static void main(String[] args) {
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//		int k = 65;
		char k = 65;
		for(int i = 1;i<=6;i++) {
			for(int j = 1;j<=i;j++) {
//				char num = (char)k;
				System.out.print(k);
			}
			k++;
			System.out.println();
		}
	}
}
