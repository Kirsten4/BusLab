import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengersInBus;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengersInBus = new ArrayList<Passenger>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getNumberInBus() {
        return this.passengersInBus.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumberInBus() < getCapacity()) {
            this.passengersInBus.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengersInBus.remove(0);
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        Passenger passenger = busStop.removePassenger();
        this.addPassenger(passenger);
    }
}
