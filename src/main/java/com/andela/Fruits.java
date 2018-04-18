package com.andela;

public class Fruits {

	private String id;
	private String name;
	private String shape;
	private String quantity;

	public Fruits(){

	}


	public Fruits(String id, String name, String shape, String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
