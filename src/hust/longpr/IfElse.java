package hust.longpr;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap a = ");
		int a = sc.nextInt();
		if (a < 18) {
			System.out.println("Ban la tre em");
		}else if (a < 65) {
			System.out.println("Ban la nguoi truong thanh");
		}else {
			System.out.println("Ban la nguoi gia");
		}

	}

}
