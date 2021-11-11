package hust.longpr.exception;

import java.io.IOException;

public class TestExceptionPropagation2 {
	void m() throws IOException {
		throw new IOException("device error"); // Checked Exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		TestExceptionPropagation2 t = new TestExceptionPropagation2();
		t.p();
		System.out.println("Phan con lai ...");

	}

}
