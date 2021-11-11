package hust.longpr.exception;

class Parent {
	void msg() throws Exception {
		System.out.println("parent");
	}

}

class TestExceptionChild extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Parent p = new TestExceptionChild();
		try {
			p.msg();
		} catch (Exception e) {
		}
		System.out.println("Luong chuan");
	}
}
