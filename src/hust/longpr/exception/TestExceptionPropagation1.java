package hust.longpr.exception;

public class TestExceptionPropagation1 {
	void m(){
		int data = 25/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
			
		}catch(Exception e) {
			System.out.println("Da xu ly");
		}
		
	}

	public static void main(String[] args) {
		TestExceptionPropagation1 t = new TestExceptionPropagation1();
		t.p();
		System.out.println("Phan con lai ...");

	}

}
