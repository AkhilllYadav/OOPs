package BasicOOPs;

public class Car {
  private String make = "Tesla";
  private String model = "Model X";
  private int door = 4;
  private boolean convertible = true;

  // get
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getDoor() {
    return door;
  }

  public boolean isConvertible() {
    return convertible;
  }

  // set
  public void setMake(String Make) {
    this.make = make;
  }

  public void setModel(String Model) {
    this.model = model;
  }

  public void setDoor(int door) {
    this.door = door;
  }

  public void setConertible(boolean convertible) {
    this.convertible = convertible;
  }

  public void describeCar() {
    System.out.println(
        door + " door " +
            make + " " +
            model + " " +
            (convertible ? "convertible" : " "));
  }
}
