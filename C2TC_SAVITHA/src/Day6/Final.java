package Day6;

public class Final {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends Final {
}

public class Final {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		f1.show();
	}
}
