package in.bushansirgur.springboot.entity;

import javax.validation.constraints.NotNull;

public class Customer {
	
	@NotNull
	private String name;
	
	@NotNull(message = "Location should not be null")
	private String location;

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
}
