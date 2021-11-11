package hust.longpr.exception;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			try {
				String s = "123";
				int a = Integer.parseInt(s);
				System.out.println(a);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			try {
				String s = " ";
				int x = s.length();
				System.out.println(x);
			} catch (NullPointerException n) {
				System.out.println(n);
			}
			System.out.println("Lenh con lai");
		} catch (Exception e) {
			System.out.println("Da xu ly");
		} finally {// dung de dong ket noi, dong file, dong stream v.v
			System.out.println("Khoi finally luon luon thuc hien");
		}
		System.out.println("Phan code con lai");

	}

}
