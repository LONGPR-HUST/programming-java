package hust.longpr.basejava;

public class BreakContinue {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
