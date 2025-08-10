package Day7;

public class circle extends Shape {
	private double radius;

	// Constructor for Circle
	public circle(double radius) {
		this.radius = radius;
	}

	// Override draw method for Circle
	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius " + radius);
	}

	// Override erase method for Circle
	@Override
	public void erase() {
		System.out.println("Erasing a circle with radius " + radius);
	} {

}
