import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void createCar() {
        Car newCar = Mockito.mock(Car.class);

        assertEquals(0, newCar.getYear());
    }

}