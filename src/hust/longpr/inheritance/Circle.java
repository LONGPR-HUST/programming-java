package hust.longpr.inheritance;

import java.util.Scanner;

public class Circle extends Point {
	private static double r;

	double chuvi(int x, int y) {
		r = Math.sqrt(x * x + y * y);

		return 2 * Math.PI * r;
	}

	double dientich() {
		return Math.PI * r * r;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do x = ");
		int x = sc.nextInt();
		System.out.print("Nhap toa do y = ");
		int y = sc.nextInt();
		Circle cr = new Circle();
		cr.setX(x);
		cr.setY(y);
		System.out.println("Chu vi cua hinh tron la: " + cr.chuvi(cr.getX(), cr.getY()));
		System.out.println("Dien tich cua hinh tron la: " + cr.dientich());

	}

}
