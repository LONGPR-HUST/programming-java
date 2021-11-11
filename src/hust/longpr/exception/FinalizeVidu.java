package hust.longpr.exception;

public class FinalizeVidu {
	public void finalize() {
		System.out.println("finalize duoc goi");
	}

	public static void main(String[] args) {
		FinalizeVidu f1 = new FinalizeVidu();
		FinalizeVidu f2 = new FinalizeVidu();
		f1 = null;
		f2 = null;
		System.gc();
	}

}
