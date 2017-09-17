
public class Car {
	
// properties
	
	int minSpeed = 0;
	int maxSpeed = 100;
	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 5;
	
	double weight = 4079;
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	boolean isTheCarOn = false;
	char condition = 'C';
	String nameOfCar = "Clifford";


// constructor with/without parameters

	public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) {
		minSpeed = customMinSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	public Car() {
	}
	

	// Getters and Setters: purpose is to minimize use of variables in main methods	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public int getMinSpeed() {
		return this.minSpeed;
	}
	

// methods

	public void printVariables() {
		System.out.println(minSpeed);
		System.out.println(maxSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
		System.out.println(numberOfPeopleInCar);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
// minSpeed does not = maxSpeed because variable is primitive data type (int, double, boolean, char)
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
// OR
//	public void upgradeMaxSpeed() {
//		setMaxSpeed(getMaxSpeed() + 10);
//	}

	
// If Statement
	public void turnTheCarOn() {
		if (!isTheCarOn) {
			isTheCarOn = true;
		}
	}
	
// If-Else Statements
	public void getIn() {
		if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			numberOfPeopleInCar++;
			System.out.println("Someone got in");
		} else {
			System.out.println("The car is full!");
		}
	}
	
	public void getOut() {
		if (numberOfPeopleInCar > 0) {
			numberOfPeopleInCar--;
			System.out.println("Someone got out");
		} else { 
			System.out.println("The car is empty!");
		}
	}
	
// Arithmetic	
	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}


// Main Object and Function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Family Car");
		Car Volvo = new Car();
		Volvo.wreckCar();
		Volvo.getIn();
		Volvo.getIn();
		Volvo.getOut();
		System.out.println("Miles Left: " + Volvo.howManyMilesTillOutOfGas());
		System.out.println("Max Miles: " + Volvo.maxMilesPerFillUp());
		Volvo.printVariables();
// Reference Type - any change to Volvo changes myCar
		System.out.println("My Car");
		Car myCar = Volvo;
		myCar.printVariables();
// Using Parameters (Inputting Arguments)
		System.out.println("Custom Car");
		Car newCar = new Car(500, 5000.5, true);
		newCar.getIn();
		newCar.getIn();
		newCar.getIn();
		newCar.getIn();
		newCar.getIn();
		newCar.printVariables();
	}	
}
