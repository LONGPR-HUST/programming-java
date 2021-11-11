package hust.longpr.exception;

public class TestFinallyBlock2 {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException ar) {
			System.out.println(ar);
			System.exit(0);// finally khong xay ra va thoat khoi chuong trinh
//			return;// thoat khoi chuong trinh nhung khoi finally van thuc hien
		} finally {
			System.out.println("Khoi finally luon thuc hien");
		}
		System.out.println("Phan con lai ...");

	}

}
