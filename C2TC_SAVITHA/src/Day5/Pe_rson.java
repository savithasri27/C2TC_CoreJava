package Day5;

public class Pe_rson {
	private String name;
	private String city;

	public Pe_rson() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="Pune";
	}

	public Pe_rson(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

}
