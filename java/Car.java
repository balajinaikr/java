public class Car {
    private String modelName;
    private String owner;
    private int regNumber;

    // Constructor
    public Car(String modelName, String owner, int regNumber) {
        this.modelName = modelName;
        this.owner = owner;
        this.regNumber = regNumber;
    }

    public void startEngine() {
        System.out.println("Engine can be started");
    }

    public void accelerate() { // Corrected method name
        System.out.println("Car can be accelerated");
    }

    public void stop() {
        System.out.println("Car can be stopped");
    }

    public void showCarInformation() { // Corrected method name
        System.out.println("The car is owned by " + owner);
        System.out.println("The car model is " + modelName);
        System.out.println("The registration number is " + regNumber);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Suzuki", "xyz", 1234); // Corrected instantiation
        myCar.startEngine();
        myCar.accelerate();
        myCar.stop();
        myCar.showCarInformation();
    }
}
      