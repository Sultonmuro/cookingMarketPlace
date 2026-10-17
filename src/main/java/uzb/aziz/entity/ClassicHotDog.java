package uzb.aziz.entity;

public class ClassicHotDog extends Product implements HotDogMenuDisplay {
    private Topping toppingType;


    public ClassicHotDog(String baseName,Topping toppingType,double basePrice){
        super(baseName,basePrice);
        this.toppingType = toppingType;
    }


    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    void setName(String baseName) {

    }

}
