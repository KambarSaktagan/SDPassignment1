public interface CarBuilder {
    CarBuilder reset();
    CarBuilder setMakeAndModel(String make, String model);
    CarBuilder setEngine(String engine);
    CarBuilder setSeats(int seats);
    Car build();
}
