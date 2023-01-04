package Encapsulation;

public class En_2 {
	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		int l=en.setLength(10);
		int b=en.setBreadth(0);
		int h=en.setHeight(30);
		en.setDimensions(l, b, h);
		System.out.println(en.getLength());
		System.out.println(en.getBreadth());
		System.out.println(en.getHeight());
	}
}
