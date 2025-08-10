package Day7;

public class ShapeDemo {
	public static void main(String[] args) {
		// Create an array of Shape objects
		shape[] shapes = new shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new Circle(5.0);
		shapes[1] = new Triangle(4.0, 3.0);
		shapes[2] = new Square(6.0);

		// Demonstrate polymorphism by calling draw and erase methods
		for (shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}
	}
}
