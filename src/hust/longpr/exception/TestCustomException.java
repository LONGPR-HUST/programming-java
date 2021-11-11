package hust.longpr.exception;

public class TestCustomException {
	void validate(int tuoi) throws InvalidAgeException {
		if (tuoi < 18) {
			throw new InvalidAgeException("Khong hop le");
		} else {
			System.out.println("Moi ban toi bo phieu");
		}
	}

	public static void main(String[] args) {

		try {
			TestCustomException test = new TestCustomException();
			test.validate(13);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Phan con lai");
	}

}
