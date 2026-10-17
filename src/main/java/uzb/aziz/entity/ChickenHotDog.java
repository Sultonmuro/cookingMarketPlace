package uzb.aziz.entity;

public class ChickenHotDog extends Product {


    public ChickenHotDog(String baseName, double basePrice) {
        super(baseName, basePrice);
    }



    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getPrice() {
        return new ChickenHotDog().getPrice();
    }

    @Override
    void setName(String baseName) {

    }
}
