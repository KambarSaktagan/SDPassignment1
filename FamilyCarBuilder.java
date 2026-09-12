public class FamilyCarBuilder implements CarBuilder {
    private String make;
    private String model;
    private String engine;
    private int seats;

    private static final String CATEGORY = "Family SUV";
    private static final String SUSPENSION = "Soft Comfort Suspension";
    private static final int MIN_SEATS = 4;

    public FamilyCarBuilder() {
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
        if (seats < MIN_SEATS) {
            throw new IllegalArgumentException("A family car must have at least " + MIN_SEATS + " seats.");
        }
        this.seats = seats;
        return this;
    }

    @Override
    public Car build() {
        // Validated construction
        if (make == null || engine == null) {
            throw new IllegalStateException("Cannot build a family car without make and engine.");
        }
        Car car = new Car(CATEGORY, make, model, engine, seats, SUSPENSION);
        this.reset(); // Prepare the builder for the next potential object
        return car;
    }
}