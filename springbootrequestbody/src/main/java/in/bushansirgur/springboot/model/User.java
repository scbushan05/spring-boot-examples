package in.bushansirgur.springboot.model;

public class User {
	
	private String name;
	
	private String location;
	
	private Long age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", location=" + location + ", age=" + age + "]";
	}
	
	
}
