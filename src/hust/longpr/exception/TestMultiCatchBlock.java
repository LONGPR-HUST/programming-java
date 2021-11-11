package hust.longpr.exception;

public class TestMultiCatchBlock {
	public static void main(String[] args) {
		int[] a = new int[5];
		try {
			a[5] = 50 / 0;

		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("Task 2 duoc hoan thanh");
		} catch (ArithmeticException ae) {
			System.out.println("Task 1 duoc hoan thanh");
		}

		catch (Exception e) {
			System.out.println("Task chung duoc hoan thanh");
		}
		System.out.println("Phan code con lai");
	}

}
