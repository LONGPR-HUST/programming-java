package hust.longpr;

import java.util.Scanner;

public class Input {

	static int a;
	static float b;
	private static int x;
	static String ten;

	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a va b:");
		a = sc.nextInt();
		b = sc.nextFloat();
		ten = sc.next();
		sc.nextLine();
		System.out.println("Sau lenh nextLine()");
	}

	public static void main(String[] args) {
		Input ip = new Input();
		nhap();
		int x = a + 5;
		float y = b + 6.0f;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(ip.x);
		System.out.println(ip.ten);

	}

}
