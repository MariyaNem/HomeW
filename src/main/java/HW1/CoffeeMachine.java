package main.java.HW1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Product> coffeeMachine = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addProduct(Product product) {
        coffeeMachine.add(product);
        return this;
    }

    public List<Product> getCoffeeMachine() {
        return coffeeMachine;
    }

    public Product findProduct(String name) {
        for (Product product : coffeeMachine) {
            if (name.equals(product.getProductName())) {
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Product saleCoffee(String nameProduct){
        Product found = findProduct(nameProduct);
        if (found != null){
            cash = cash + found.getProductPrice();
            coffeeMachine.remove(found);
        }
        return found;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Product product:coffeeMachine){
            builder.append(product).append("\n");
        }
        return builder.toString();
    }
}
