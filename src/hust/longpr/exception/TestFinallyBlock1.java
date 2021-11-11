package hust.longpr.exception;

public class TestFinallyBlock1 {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		}catch(NullPointerException n){// exception khong duoc xu ly 
			System.out.println(n);
			
		}finally {
			System.out.println("Khoi finally luon duoc thuc hien");
		}
		System.out.println("Phan code con lai...");

	}

}
