public class CarDirector {
    public void constructDodgeDemon(CarBuilder builder) {
        builder.reset()
                .setMakeAndModel("Dodge", "Challenger SRT DEMON")
                .setEngine("6.2-liter HEMI V-8")
                .setSeats(2);
    }

    public void constructHyundaiSantafe(CarBuilder builder) {
        builder.reset()
                .setMakeAndModel("Hyundai", "SantaFe")
                .setEngine("2.5-liter turbocharged inline-four")
                .setSeats(7);
    }
}
