package hw2;

public class item2 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int product = 1;
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println(product);
	}
}
