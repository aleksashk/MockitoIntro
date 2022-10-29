import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CarTest {

    @Mock
    Car newCar;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createCar() {
        assertEquals(0, newCar.getYear());
    }

    @Test
    void remoteServiceReturnValue() {
        when(newCar.testInt(4)).thenReturn(10);

        assertEquals(10, newCar.testInt(4));
    }

    @Test
    void getOwner() {
        when(newCar.getOwner()).thenReturn("Aleksandr");

        assertEquals("Aleksandr", newCar.getOwner());
    }

    @Test
    void verificationTest() {
        assertNull(newCar.getOwner());

        verify(newCar, atLeast(1)).getOwner();//time(1); never; atLeast; atMost; only
    }

}