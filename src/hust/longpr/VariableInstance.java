package hust.longpr;

public class VariableInstance {
	static int tuoi;// Bien instance
	private static int namSinh;

	public static void intTuoi() {
		int tuoi = 15;// Bien local trong phuong thuc intTuoi()
		namSinh = 15;
		System.out.println(tuoi);
	}

	public static void main(String[] args) {
		
		int namSinh = 10;// Bien Local trong ham main()
		if (namSinh > 0) {
			int tuoi = 2021 - namSinh;// Bien Local trong mot khoi lenh if
			System.out.println(tuoi);
		}
		System.out.println(tuoi);// Bien Instance trong ham main()
		VariableInstance var = new VariableInstance();
		System.out.println(namSinh);
		System.out.println(var.namSinh);
		intTuoi();
		System.out.println(var.namSinh);
	}

}
