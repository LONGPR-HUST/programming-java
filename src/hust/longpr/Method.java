package hust.longpr;

public class Method {
	public static void main(String[] args) {
		int a = -5;
		float b = -5.5f;
		System.out.println("Gia tri tuyet doi cua a la:" + abs(a));
		System.out.println("Gia tri tuyet doi cua b la:" + abs(b));

	}

	private static int abs(int a) {
		if (a > 0)
			return a;
		return (a * -1);
	}

	private static float abs(float b) {
		if (b > 0)
			return b;
		return (b * -1);
	}

}
