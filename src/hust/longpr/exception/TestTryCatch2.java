package hust.longpr.exception;

public class TestTryCatch2 {

	public static void main(String[] args) {
		try {
			int data = 50 /0;
		}catch(ArithmeticException e) {
			System.out.println("Khong the chia cho 0 "+ e);
		}
		System.out.println("Phan code con lai");

	}

}
