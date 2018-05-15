package com.andela.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "fruits")
public class Fruits {

	@Id
	@NotNull
	private Long id;
	private String name;
	private String shape;
	private String quantity;

	@ManyToOne
	public Person person;

	public Fruits(){}

	public Fruits(Long id, String name, String shape, String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


}
