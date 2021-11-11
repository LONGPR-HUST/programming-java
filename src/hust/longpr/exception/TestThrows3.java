package hust.longpr.exception;

import java.io.IOException;

public class TestThrows3 {

	public static void main(String[] args) throws IOException {//Khai bao exceoption
		N n = new N();
		n.method();
		System.out.println("Luong chuan");
	}

}
