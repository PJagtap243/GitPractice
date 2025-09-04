package JavaPractice.abstraction;

public class BMW {

	public static void main(String[] args) {
		
//		Car c = new Car();
//		
//		c.fourWheel();
//		c.fuelTank();
//		c.spedoMeter();
		
		Vehicle v = new Car();
//		c.fourWheel(); //We can not call the Car class methods using Abstract class ref variable
		v.fuelTank();
		v.spedoMeter();
		
	}

}
