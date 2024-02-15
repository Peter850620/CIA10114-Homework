package hw5;

public class Item4 {
	public static char[] genAuthCode() {
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int num = (int) (Math.random() * 85 + 48);
			if ((num >= 48 && num <= 57) || (num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
				password[i] = (char) num;
			} else {
				i--;
			}
		}
		return password;
	}

	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}
}
