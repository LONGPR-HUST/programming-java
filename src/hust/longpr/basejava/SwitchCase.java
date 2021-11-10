package hust.longpr.basejava;

public class SwitchCase {

	public static void main(String[] args) {
		char a = 'x';
		switch (a) {
		case 'A':
			System.out.println("Xuat sac");
			break;
		case 'B':
			System.out.println("Tot");
			break;
		case 'C':
			System.out.println("Kha");
			break;
		case 'D':
			System.out.println("Trung binh");
			break;
		case 'F':
			System.out.println("Yeu");
			break;
		default:
			System.out.println("Invalid value");
		}

	}

}
