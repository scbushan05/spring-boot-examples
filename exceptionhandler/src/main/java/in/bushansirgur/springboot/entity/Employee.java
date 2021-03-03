package in.bushansirgur.springboot.entity;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String location;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Integer age, String location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
}
