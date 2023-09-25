public class Car {

    public String make;
    public String model;
    public int doors;
    public boolean convertible;

    public void describeCar(){
        System.out.println(doors + " doors" + make + model + (convertible ? "Convertible" :""));
    }
}
