package cubitClass;

class ParentClass1 {
	String brandName;

	public void carInfo() {
		System.out.println("This is parentclass and this method prints information on the car.");
	}
}

class ToyotaCar extends ParentClass1 {
	// Defining new attributes for the child class
	String driveSystem;
	String brakeType;
	// overriding parent class method carInfo 
	public void carInfo() {
		System.out.println("The new " + brandName + " with " + driveSystem + " and " + brakeType + " brakes.");
	}
}

class TeslaCar extends ParentClass1 {
	// Defining new attributes for the child class
	String brandName;
	String batteryLife;

	// overriding parent class method carInfo
	public void carInfo() {
		System.out.println("Presenting the new model Y " + brandName + " ,the greenest car on the planet with "
				+ batteryLife + " of battery life.");
	}
}

public class HWC11_ParentCarClass {
	public static void main(String[] args) {
		// Creating object of parent class
		ParentClass1 defaultCar = new ParentClass1();
		// Printing parent class attributes through parent class method
		defaultCar.carInfo();
		// Creating object of subclass2 and modifying attributes
		ToyotaCar car1 = new ToyotaCar();
		car1.brandName = "Toyota";
		car1.driveSystem = "4WD";
		car1.brakeType = "Hydraulic";
		car1.carInfo();
		// Creating object of subclass2 and modifying attributes
		TeslaCar car2 = new TeslaCar();
		car2.brandName = "Tesla";
		car2.batteryLife = "20 years";
		car2.carInfo();
	}
}
