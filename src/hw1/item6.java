package hw1;

public class item6 {
	public static void main(String[] args) {
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
		System.out.println(5 + 5);		//2個5都是數字，所以直接相加
		System.out.println(5 + '5');	//'5'是字元，依照ASCII表對照的值為53，所以最後與數字5相加等於53
		System.out.println(5 + "5");	//數字5，遇到字串5，兩者進行串接
	}
}
