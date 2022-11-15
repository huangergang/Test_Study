package test.com.javaSE1.sixUnit;

public class Phone implements Cloneable {

    private String brand;  // 手机品牌

    private String model;  // 手机型号

    public Chip chip;

    public Phone(String brand, String model, Chip chip) {
        this.brand = brand;
        this.model = model;
        this.chip = chip;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new Phone(this.brand, this.model, new Chip(this.chip.getBrand(), this.chip.getModel()));
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", chip=" + chip +
                '}';
    }
}
