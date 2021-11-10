package hust.longpr.basejava;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = null;
		boolean isCreate = false;
		try {
			file = new File("F:\\test2.txt");
			isCreate = file.createNewFile();
			if(isCreate) {
				System.out.println("Da tao file thanh cong");
			}else {
				System.out.println("Tao file that bai");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
