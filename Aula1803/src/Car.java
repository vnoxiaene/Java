package example;

import java.time.LocalDate;

public class Car {
	
	private String brand;
	private LocalDate buildDate;
	
	public Car(String brand, LocalDate buildDate) {
		super();
		this.brand = brand;
		this.buildDate = buildDate;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public LocalDate getBuildDate() {
		return buildDate;
	}
	
	public void setBuildDate(LocalDate buildDate) {
		this.buildDate = buildDate;
	}
}
