package Abstraction;

public class Circle extends Shapes {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.colorShape();
		c.drawShape();
		c.moveShape();
	}

	@Override
	public void drawShape() {
		System.out.println("draw a circle");

	}

	@Override
	public void colorShape() {
		System.out.println("color a circle");

	}

	@Override
	public void moveShape() {
		System.out.println("move a  circle");

	}
}
