
public class App {
  public static void main(String[] args) {

    Car car = new Car();
    car.setMake("Toyota");
    car.setModel("Camry");
    car.setYear(2020);

    System.out.println("Make: " + car.getMake());
    System.out.println("Model: " + car.getModel());
    System.out.println("Year: " + car.getYear());

  }
}
