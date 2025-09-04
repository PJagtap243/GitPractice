package JavaPractice.abstraction;

public class Car extends Vehicle{
	
	public void fourWheel() {
		System.out.println("This is Car class fourwheel method..");
	}

	@Override
	public void fuelTank() {
		System.out.println("This is Car class fuelTank method..");		
	}
	
	@Override
	public void spedoMeter() {
		System.out.println("This is Car class Speedometer..");
	}

}
