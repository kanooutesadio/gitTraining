package com.saraya;



public class Car {

	private Integer id;
	private String make;
	private String model;
	private Integer year;
	private String description;
	private String price;
	
	public Car() {
		super();
	}

	public Car(String make, String model, Integer year, String description, String price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.description = description;
		this.price = price;
	}

	public Car(Integer id, String make, String model, Integer year, String description, String price) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.description = description;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", description="
				+ description + ", price=" + price + "]";
	}
	
	
}
