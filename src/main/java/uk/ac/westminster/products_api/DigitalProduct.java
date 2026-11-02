package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double weightKg;
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        // TODO: nothing is shipped, so the full rate applies }

    @Override
        public void applyDiscount(double rate) {
        // TODO: nothing is shipped, so the full rate applies
         }
         @Override public double getDiscountedPrice(){
            // TODO: return the field
            }
    // no-arg constructor — Jackson needs this to build
    // an object from an incoming JSON request body
    public DigitalProduct() {
    }
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | " + weightKg + "Kg";
    }
    public void applyDiscount(double rate){

    }
    public double getDiscountedPrice(){

    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}

