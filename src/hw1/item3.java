package hw1;

public class item3 {
	public static void main(String[] args) {
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		day = 256559 / (60 * 60 * 24);
		hour = 256559 % (60 * 60 * 24) / (60 * 60);
		minute = 256559 % (60 * 60 * 24) % (60 * 60) / 60;
		second = 256559 % (60 * 60 * 24) % (60 * 60) % 60;
		
		System.out.println("為" + day + "天、" + hour + "小時、"+ minute +"分與"+ second +"秒");
	}
}
