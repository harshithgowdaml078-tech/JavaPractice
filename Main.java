public class Main {

        public static void main(String[] args) {

            Car car = new Car();
            car.setMake("porsche");
            car.setModel("Carrera");
            car.setColor("polished black");
            car.setDoors(2);
            car.setConvertible(true);
            System.out.println("make = " + car.getMake());
            System.out.println("model = " + car.getModel());
            car.describeCar();
        }
    }


