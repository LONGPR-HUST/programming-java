package hust.longpr.basejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) {
//		int a[] = { 1, 2 };
//		try {
//			System.out.println(a[3]);
//		} catch (Exception e) {
//			System.out.println("Ngoai le phat sinh " + e);
//
//		}
//		System.out.println("Thoat khoi khoi try catch");

		int x;
		FileInputStream file = null;
		try {
			file = new FileInputStream("intput.txt");
			x = (byte) file.read();
		} catch (FileNotFoundException f) {
			System.out.println(f);
		} catch (IOException i) {
			System.out.println(i);
		}finally {
			System.out.println("Khoi finally da chay");
		}

	}

}
