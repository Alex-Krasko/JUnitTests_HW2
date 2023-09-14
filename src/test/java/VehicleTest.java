import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;

public class VehicleTest {
    static Car car1 = new Car("company", "model", 2023);
    static Motorcycle moto1 = new Motorcycle("company", "model", 2023);
public static void main(String[] args) {
    assert(car1 instanceof Vehicle) : "Error. Car doesn't a vehicle.";

    assert(4 == car1.getNumWheels()) : "Error. Car does haven't more or less wheel than 4.";
    assert(2 == moto1.getNumWheels()) : "Error. Motorcycle does haven't more or less wheel than 2.";
    car1.testDrive();
    moto1.testDrive();
    assert(60 == car1.getSpeed()) : "Error. Car can't speed up more than 60.";
    assert(75 == moto1.getSpeed()) : "Error. Motorcycle can't speed up more than 75.";
    car1.park();
    moto1.park();
    assert(0 == car1.getSpeed()) : "Error. In 'Park'-mode vehicle must be fully stopped.";
    assert(0 == moto1.getSpeed()) : "Error. In 'Park'-mode motorcycle must be fully stopped.";
}

}
