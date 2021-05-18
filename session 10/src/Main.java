import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Box<String, String, Integer, Double, Car> box = new Box<>();
        MyList<Car> cars = new MyArray<>();
        System.out.println("isEmpty : " + cars.isEmpty());
        System.out.println("size : " + cars.size());

        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        Car car4 = new Car("car4");
        Car car5 = new Car("car5");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("\n* After add \"car1\" to \"car5\"* ");
        System.out.println("isEmpty : " + cars.isEmpty());
        System.out.println("size : " + cars.size());
        System.out.println("contains \"car4\" : " + cars.contains(car4));
        System.out.println("get index 3 : " + cars.get(3));

        cars.remove(car4);
        System.out.println("\n* After remove \"car4\" * ");
        System.out.println("size : " + cars.size());
        System.out.println("contains \"car4\" : " + cars.contains(car4));
        System.out.println("get index 3 : " + cars.get(3));
        System.out.println("get index of car4 : " + cars.indexOf(car4));

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("index " + i + " is :" + cars.get(i));
        }

        cars.clear();
        System.out.println("\n* After clear cars *");
        System.out.println("isEmpty : " + cars.isEmpty());
        System.out.println("size : " + cars.size());
    }
}
