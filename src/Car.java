public class Car {

    private String make;
    private String model;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    };
    public String getModel(){
        return model;
    };
    public int getDoors(){
        return doors;
    }
    public boolean getConvertible(){
        return convertible;
    }

    public void setMake(String make) {
        this.make = make;
    };

    public void setModel(String model) {
        this.model = model;
    };

    public void setDoors(int doors) {
        this.doors = doors;
    };
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    };

    public void describeCar(){
        System.out.println(doors + " doors" + make + model + (convertible ? "Convertible" :""));
    }
}
