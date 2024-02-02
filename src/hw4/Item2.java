package hw4;

public class Item2 {
	public static void main(String[] args) {
//		 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		 例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Peter Lee,你好";
		int i = s.length() - 1;
		while(i >= 0) {
			System.out.print(s.charAt(i));
			i--;
		}
	}
}
