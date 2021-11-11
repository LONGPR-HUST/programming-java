package hust.longpr.inheritance;

public class C extends A {
	private int r;

	public static void main(String[] args) {
		C c = new C();
		c.setX(3);
		c.setY(6);
		c.r = 6;
		int z = (c.getX() + c.getY()) * c.r;

		System.out.println(z);

	}

}
