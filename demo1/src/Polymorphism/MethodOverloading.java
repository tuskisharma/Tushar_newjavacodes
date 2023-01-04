package Polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.Login("rtrtr@gmail.com", "hjbdhjbf");
	}

	public void Login(String s, String p) {
		System.out.println("user login by using email and password");
	}

	public void Login(int s, String p) {
		System.out.println("user login by using phoneno. and password");
	}

	public void Login(int s, String a, int p) {
		System.out.println("user login by using phoneno/pin and password");
	}

}
