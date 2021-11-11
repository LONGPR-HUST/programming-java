package hust.longpr.polymorphism;
/*
 * Qua trinh ghi de khong xay ra voi phuong thuc co khac kieu tra ve 
 * va khac tham so
 * Qua trinh ghi de khong xay ra voi thanh vien du lieu 
 * 
 * 
 * */
public class Oto extends Car {
	public void run() {
		System.out.println("O to dang chay");
	}
	public static void main(String[] args) {
		Car a = new Oto();//Qua trinh upcasting
		a.run();
	}
}
