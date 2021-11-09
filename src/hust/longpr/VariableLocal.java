package hust.longpr;

public class VariableLocal {
	public void intTuoi() {
		int tuoi = 29;// Bien cuc bo trong phuong thuc intTuoi()
		System.out.println(tuoi);
	}

	public static void main(String[] args) {
		int namSinh = 1990;
		if (namSinh > 0) {
			int tuoi = 2021 - namSinh;// Bien cuc bo trong khoi lenh if
			System.out.println(tuoi);
		}
		int tuoi = 0;//Bien cuc bo trong ham  main()
		System.out.println(tuoi);
	}

}
