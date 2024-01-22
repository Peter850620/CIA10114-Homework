package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		一：使用for迴圈 + while迴圈
		System.out.println("一：使用for迴圈 + while迴圈");

		int i1 = 1, j1 = 1;
		for (; i1 <= 9; i1++) {
			j1 = 1;
			while (j1 <= 9) {
				System.out.print(i1 + "*" + j1 + "=" + i1 * j1 + "\t");
				j1++;
			}
			System.out.println();
		}

//		二：使用for迴圈 + do while迴圈
		System.out.println("\n二：使用for迴圈 + do while迴圈");
		int i2 = 1, j2 = 1;
		for (; i2 <= 9; i2++) {
			j2 = 1;
			do {
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
				j2++;
			} while (j2 <= 9);
			System.out.println();
		}
//		三：使用while迴圈 + do while迴圈
		System.out.println("\n三：使用while迴圈 + do while迴圈");
		int i3 = 1, j3 = 1;
		while (i3 <= 9) {
			j3 = 1;
			do {
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
				j3++;
			} while (j3 <= 9);
			i3++;
			System.out.println();
		}
	}
}
