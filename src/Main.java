public class Main {
    public static void main (String[] args){
        Car rava = new Car();
        rava.setMake("toyota");
        rava.setMake("2003");
        rava.setDoors(4);
        rava.setConvertible(true);


        System.out.println("Make = " + rava.getMake());
        System.out.println("Model = " + rava.getModel());
        System.out.println("Convertible = " + rava.getConvertible());
        System.out.println("Doors = " + rava.getDoors());
        rava.describeCar();

    }
}