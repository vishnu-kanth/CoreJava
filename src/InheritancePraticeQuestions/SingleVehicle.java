package InheritancePraticeQuestions;

public class SingleVehicle {
	static class vehicle{
		int speed;
		String fuelType;
		
		vehicle(int speed ,String fuelType){
			this.speed = speed;
			this.fuelType = fuelType;
		}
		
	}
	
	static class Car extends vehicle{
		String brand;
		
		Car(int speed,String fuelType,String brand){
			super(speed, fuelType);
			this.brand=brand;
			
		}
	}
	public static void main(String args[]) {
		Car c = new Car(101,"Petrol","Innova Crysta");
		System.out.println("Speed: " +c.speed);
		System.out.println("FuelType: " +c.fuelType);
		System.out.println("Brand: " +c.brand);
		
	}
}
