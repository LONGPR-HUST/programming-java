package hust.longpr.basejava;

public class Array {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 2;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		float[] b = { 1, 2, 3, 4 };
		for (float i : b) {// kieu i tuong thich voi kieu cua mang b
			System.out.println(i);
		}
	}

}
