package in.bushansirgur.springboot.entity;

public class Customer {
	
	private String name;
	
	private Long age;
	
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", location=" + location + "]";
	}

	public Customer(String name, Long age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
}
