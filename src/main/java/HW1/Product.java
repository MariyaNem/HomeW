package main.java.HW1;

public class Product {
    private String productName;
    private int productPrice;
    private int productVolume;
    private int productTemp;

    public Product(String productName, int productPrice, int productVolume, int productTemp){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productVolume = productVolume;
        this.productTemp = productTemp;

    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Цена: %d, Объём: %d, Температура: %d", productName, productPrice, productVolume, productTemp);
    }

    public String getProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public int getProductVolume() {
        return productVolume;
    }
    public int getProductTemp() {
        return productTemp;
    }
}
