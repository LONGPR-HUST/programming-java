package hust.longpr;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = null;
		String s = "Lap trinh java";
		byte[] a = s.getBytes(); // Ep kieu string ve mang byte
		try {
			file = new FileOutputStream("F:\\output.txt");
			file.write(a);//ghi vao file
			System.out.println("Da ghi thanh cong");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			file.close();//Neu chuong trinh loi thi dong file
		}

	}

}
