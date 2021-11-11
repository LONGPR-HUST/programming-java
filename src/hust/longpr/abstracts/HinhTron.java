package hust.longpr.abstracts;

public class HinhTron extends HinhHoc {
	float r;

	HinhTron(float r) {
		this.r = r;
	}

	@Override
	double dientich() {
		return Math.PI * r * r;
	}

	@Override
	double chuvi() {

		return 2 * Math.PI * r;
	}

	public void display() {
		System.out.println("Dien tich cua hinh tron la: " + dientich());
		System.out.println("Chu vi cua hinh tron la: " + chuvi());
	}

	

}
