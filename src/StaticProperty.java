public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda3","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
