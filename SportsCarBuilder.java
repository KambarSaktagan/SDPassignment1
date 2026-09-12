public class SportsCarBuilder implements CarBuilder {
    private String make;
    private String model;
    private String engine;
    private int seats;

    private static final String CATEGORY = "Sports Car";
    private static final String SUSPENSION = "Stiff Track Suspension";
    private static final int MAX_SEATS = 2;

    public SportsCarBuilder() {
        this.reset();
    }

    @Override
    public CarBuilder reset() {
        this.make = null;
        this.model = null;
        this.engine = null;
        this.seats = 0;
        return this; // Method chaining
    }

    @Override
    public CarBuilder setMakeAndModel(String make, String model) {
        this.make = make;
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        // Validated construction
        if (seats > MAX_SEATS) {
            throw new IllegalArgumentException("A sports car cannot have more than " + MAX_SEATS + " seats.");
        }
        this.seats = seats;
        return this;
    }

    @Override
    public Car build() {
        // Validated construction
        if (make == null || engine == null) {
            throw new IllegalStateException("Cannot build a sports car without make and engine.");
        }
        Car car = new Car(CATEGORY, make, model, engine, seats, SUSPENSION);
        this.reset(); // Prepare the builder for the next potential object
        return car;
    }
}