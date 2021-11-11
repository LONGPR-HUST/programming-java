package hust.longpr.encapsulation;

import java.util.Scanner;

public class Demo {
	int areaHCN(int dai, int rong) {
		return dai * rong;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai = ");
		int dai = sc.nextInt();
		System.out.print("Nhap chieu rong = ");
		int rong = sc.nextInt();
		HinhChuNhat hcn = new HinhChuNhat();
		Demo dm = new Demo();
		// Truyen
		hcn.setDai(dai);
		hcn.setRong(rong);
		System.out.println("dien tich cua hinh chu nhat la : " + dm.areaHCN(hcn.getDai(), hcn.getRong()));

	}

}
