package uzb.aziz.entity;

public abstract class Product implements  HotDogMenuDisplay {
    private String baseName;
    private double basePrice;

    public Product(String baseName, double basePrice) {
        this.baseName = baseName;
        this.basePrice = basePrice;
    }


    abstract void setName(String baseName);


    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public double getBasePrice() {
        return basePrice;
    }


}
