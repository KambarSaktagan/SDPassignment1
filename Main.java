public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        // 1. Using Director to build a Sports Car
        System.out.println("--- Building with Director ---");
        CarBuilder sportsBuilder = new SportsCarBuilder();
        director.constructDodgeDemon(sportsBuilder);
        Car demon = sportsBuilder.build();
        System.out.println(demon);

        // 2. Using Director to build a Family SUV
        CarBuilder familyBuilder = new FamilyCarBuilder();
        director.constructHyundaiSantafe(familyBuilder);
        Car santaFe = familyBuilder.build();
        System.out.println(santaFe);

        // 3. Using Fluent API directly without the Director
        System.out.println("\n--- Building Directly with Fluent API ---");
        Car customMustang = new SportsCarBuilder()
                .setMakeAndModel("Ford", "Mustang GT")
                .setEngine("5.0L V8")
                .setSeats(2)
                .build();
        System.out.println(customMustang);

        // 4. Demonstrating Validated Construction
        System.out.println("\n--- Testing Clean Code Validation ---");
        try {
            System.out.println("Attempting to build a Family Car with only 2 seats...");
            new FamilyCarBuilder()
                    .setMakeAndModel("Smart", "Fortwo")
                    .setEngine("1.0L 3-Cylinder")
                    .setSeats(2) // Will fail: Family builder requires >= 4 seats
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Validation caught invalid state: " + e.getMessage());
        }
    }
}