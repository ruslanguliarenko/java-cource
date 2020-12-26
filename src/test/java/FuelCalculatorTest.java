import com.company.lesson1.Car;
import com.company.lesson1.CheckPoint;
import com.company.lesson1.FuelCalculator;
import com.company.lesson1.RoadMap;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    private FuelCalculator fuelCalculator = new FuelCalculator();

    @Test
    public void shouldEnoughFuelToPassTwoCheckPoint() {
        Car car = new Car(2, 10);
        CheckPoint start = new CheckPoint(10, 10, false);
        CheckPoint finish = new CheckPoint(1, 10, false);
        RoadMap roadMap = new RoadMap(List.of(start, finish));

        assertEquals(true, fuelCalculator.enoughFuelToGoAllWay(car, roadMap));
    }
}
