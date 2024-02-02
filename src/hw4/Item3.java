package hw4;

import java.util.Iterator;

public class Item3 {
	public static void main(String[] args) {
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] str = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				switch (str[i].charAt(j)) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				}
			}

		}
		System.out.println("陣列裡面共有" + count + "個母音");
	}
}
