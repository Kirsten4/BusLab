import java.util.ArrayList;

public class BusStop {

    private ArrayList<Passenger> passengers;

    public BusStop(){
        this.passengers = new ArrayList<Passenger>();
    }

    public void add(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public Passenger removePassenger() {
        return this.passengers.remove(0);
    }
}
