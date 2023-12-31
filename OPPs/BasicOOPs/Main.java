package BasicOOPs;

public class Main {
  public static void main(String[] args) {

    Car car = new Car();

    // set
    car.setMake("Porche");
    car.setDoor(2);
    car.setConertible(true);
    car.setModel("Model 2"); 

    System.out.println("make = " + car.getMake());
    System.out.println("model = " + car.getModel());

    car.describeCar();
  }

}
