package hust.longpr.basejava;

import java.io.FileOutputStream;
import java.io.IOException;

public class ThrowsAndThrow {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = null;
		file = new FileOutputStream("F:\\output1.txt");
		file.write(5);

	}

}
