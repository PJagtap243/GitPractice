package JavaPractice.abstraction;

public abstract class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle class constructor");
	}
	
	public abstract void fuelTank();
	
	public void spedoMeter() {
		System.out.println("Vechile class speedometer");
	}
}
