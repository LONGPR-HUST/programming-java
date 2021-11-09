package hust.longpr;

public class MinValue {
//	public int min(int a, int b) {
//		if (a < b)
//			return a;
//		return b;
//	}
/*
 * Phuong thuc chi ket thuc khi: 
 * 		- Gap duoc lenh return;
 * 		- Khoi lenh trong phuong thuc da thuc hien xong;
 * 
 * 
 * */
	public static int max(int a[], int n) {
		int max = a[0];
		for (int i : a) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public static void main(String[] args) {
//		MinValue m = new MinValue();
//		int min = m.min(4, 5);
//		System.out.println("Gia tri nho nhat cua 2 so a va b la: " + min);

		int arr[] = { 1, 3, 43, -4, 55, 99 };
		System.out.println("Gia tri lon nhat cua mang la: " + max(arr, arr.length));
		

	}

}
