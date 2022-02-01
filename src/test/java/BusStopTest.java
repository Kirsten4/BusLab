import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop();
        passenger = new Passenger();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.add(passenger);
        assertEquals(1, busStop.getPassengerCount());
    }

    @Test
    public void canRemovePeronFromQueue(){
        busStop.add(passenger);
        busStop.removePassenger();
        assertEquals(0, busStop.getPassengerCount());
    }
}
