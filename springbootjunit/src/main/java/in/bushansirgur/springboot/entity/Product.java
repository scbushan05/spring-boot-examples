package in.bushansirgur.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Product {
	
	@Id
	private Long id;
	
	private String name;
	
	private Double price;
	
	private String description;
}
