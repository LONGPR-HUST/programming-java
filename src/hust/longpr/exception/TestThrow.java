package hust.longpr.exception;

public class TestThrow {
	static void validate(int tuoi) {
		if (tuoi < 18) {
			throw new ArithmeticException("Khong hop le");
		} else {
			System.out.println("Chao mung ban den voi bo phieu");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("Phan code con lai");

	}

}
