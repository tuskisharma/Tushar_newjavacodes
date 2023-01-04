package Encapsulation;

public class Encapsulation {
	private int length;
	private int breadth;
	private int height;

	public void setDimensions(int l, int b, int h) {
		if(l>=1 && b>=1&& h>=1) {
			System.out.println("Box with dimensions created are:" + l + " " + b + " " + h);
		}else {
			System.out.println("invalid dimensions");
		}
		
	}

	public int setLength(int l) {
		length = l;
		return length;
	}

	public int setBreadth(int b) {
		breadth = b;
		return breadth;
	}

	public int setHeight(int h) {
		height = h;
		return height;
	}

	public int getLength() {

		return length;
	}

	public int getBreadth() {

		return breadth;
	}

	public int getHeight() {

		return height;
	}

}
