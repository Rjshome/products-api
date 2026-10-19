package uk.ac.westminster.products_api;

    public class PhysicalProduct extends Product {
        private double weightKg;
        private String dimensions;

        // TODO (a): empty no-arg constructor for Jackson

        // TODO (b): full constructor.
        // First line must be super(id, name, price);
        // then assign this.weightKg and this.dimensions

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public PhysicalProduct(){}

    // TODO (c): getWeightKg() and getDimensions() }
    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
    }


