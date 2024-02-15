package hw5;

public class Work03 {
	private int max1;
	private double max2;

	public int maxElement(int x[][]) {

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max1 < x[i][j]) {
					max1 = x[i][j];
				}
			}
		}
		return max1;
	}

	public double maxElement(double x[][]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max2 < x[i][j]) {
					max2 = x[i][j];
				}
			}
		}
		return max2;
	}
}
