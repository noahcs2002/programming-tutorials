public class Flight {
   
    private String name;
    private String airportDepartingCode;
    private String airportArrivingCode;
    private double pricePerTicket;
    private int durationInMinutes;
    private int passengers;
    private int maxCapacity;


    public Flight(String name, String airportDepartingCode, String airportArrivingCode, double pricePerTicket, int durationInMinutes, int passengers, int maxCapacity) {
        this.name = name;
        this.airportDepartingCode = airportDepartingCode;
        this.airportArrivingCode = airportArrivingCode;
        this.pricePerTicket = pricePerTicket;
        this.durationInMinutes = durationInMinutes;
        this.passengers = passengers;
        this.maxCapacity = maxCapacity;
    }    

     public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirportDepartingCode() {
        return this.airportDepartingCode;
    }

    public void setAirportDepartingCode(String airportDepartingCode) {
        this.airportDepartingCode = airportDepartingCode;
    }

    public String getAirportArrivingCode() {
        return this.airportArrivingCode;
    }

    public void setAirportArrivingCode(String airportArrivingCode) {
        this.airportArrivingCode = airportArrivingCode;
    }

    public double getPricePerTicket() {
        return this.pricePerTicket;
    }

    public void setPricePerTicket(double pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void book() {
        if(passengers == maxCapacity) {
            System.out.println("Cannot book flight");
            return;
        }
        else {
            passengers += 1;
            System.out.println("Booked!");
        }
    }

    public void cancel() {
        if(passengers == 0) {
            System.out.println("No passengers on this flight");
            return;
        }
        else {
            System.out.println("Cancelled!");
        }
    }

    @Override
    public String toString() {
        String result = "";

        result += name + "\nFROM: " + airportDepartingCode + "\nTO:" + airportArrivingCode;
        result += "\nDuration: " + durationInMinutes + "MINUTES.";
        result += "\nPASSENGERS: " + passengers;
        result += "\nMAX CAPACITY: " + maxCapacity;
        result += "\n";
        return result;
    }
}