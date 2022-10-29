import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CarTest {

    @Test
    void createCar() {
        Car newCar = Mockito.mock(Car.class);

        assertEquals(0, newCar.getYear());
    }

    @Test
    void remoteServiceReturnValue() {
        Car newCar = Mockito.mock(Car.class);
        when(newCar.testInt(4)).thenReturn(10);

        assertEquals(10, newCar.testInt(4));
    }

    @Test
    void getOwner() {
        Car newCar = Mockito.mock(Car.class);
        when(newCar.getOwner()).thenReturn("Aleksandr");

        assertEquals("Aleksandr", newCar.getOwner());
    }

    @Test
    void verificationTest(){
        Car newCar = Mockito.mock(Car.class);
        assertNull(newCar.getOwner());

        verify(newCar).getOwner();
    }

}