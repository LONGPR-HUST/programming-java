package hust.longpr.exception;

public class Exception6 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Thuc hien phep chia");
				int b = 50 / 0;
			} catch (ArithmeticException ar) {
				System.out.println(ar);
			}
			try {
				System.out.println("Truy cap phan tu mang");
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException arr) {
				System.out.println(arr);
			}
			System.out.println("Lenh con lai");
		} catch (Exception e) {
			System.out.println("Da xu ly");
		}
		System.out.println("Luong chuan");

	}

}
