package hust.longpr.basejava;

public class Array2D {

	public static void main(String[] args) {
		int a[][] = new int[3][3];//khai bao va khoi tao mang 2 chieu
		int b[][] = { { 1, 3, 4 }, { 1, 3, 4 }, { 1, 4, 3 } };//khai bao va khoi tao gia tri cho mang 2 chieu
		a = b;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
