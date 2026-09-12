public class Car {
    public final String category;
    public final String make;
    public final String model;
    public final String engine;
    public final int seats;
    public final String suspensionType;

    public Car(String category, String make, String model, String engine, int seats, String suspensionType) {
        this.category = category;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.seats = seats;
        this.suspensionType = suspensionType;
    }

    public String toString() {
        return String.format (
                "[%s] %s %s | Engine:%s | Seats:%d | Suspension: %s",
                category, make, model, engine, seats, suspensionType
        );

    }
}

