package hust.longpr.exception;

public class TestThrows2 {
	 public static void main(String[] args) {
			try {
				M m = new M();
				m.method();
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Phan con lai ...");
		}

}
