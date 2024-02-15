package hw5;

//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Item2 {
	public static void randAvg() {
		int num = 0;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 101);
			System.out.print(num + " ");
			sum += num;
		}
		avg = sum / 10.0;
		System.out.print("\n" + avg);
	}

	public static void main(String[] args) {
		randAvg();
	}
}
