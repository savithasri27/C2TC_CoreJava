package Day4;

public class Privateconstructordemo {
	public static void main(String s[]) {
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}
