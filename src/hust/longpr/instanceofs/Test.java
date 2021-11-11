package hust.longpr.instanceofs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();// neu dog = null thi tra ve false, neu Dog implements interface thi dog co kieu interface
		System.out.println(dog instanceof Animal);
	}

}
