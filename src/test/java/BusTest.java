import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 3);
        passenger = new Passenger();
        busStop = new BusStop();
        busStop.add(passenger);
        busStop.add(passenger);
        busStop.add(passenger);
        busStop.add(passenger);
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void hasEmptyBus(){
        assertEquals(0, bus.getNumberInBus());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.getNumberInBus());
    }

    @Test
    public void removePassengerFromBus(){
        bus.addPassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(0, bus.getNumberInBus());
    }

    @Test
    public void noPassengerAddedIfAtCapacity(){
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(3, bus.getNumberInBus());
    }

    @Test
    public void canAddPassengerFromBusStop(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.getNumberInBus());
    }
}
