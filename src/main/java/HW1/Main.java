package main.java.HW1;

public class Main {
    public static void main(String[] args){
        CoffeeMachine apparat = new CoffeeMachine();
        apparat.addProduct(new Product("Капучино", 100, 200, 60))
                .addProduct(new Product("Латте", 120, 200, 60))
                .addProduct(new Product("Американо", 70, 100, 80));


        System.out.println(apparat);
        Product product = apparat.findProduct("Латте");

        System.out.println("__________Ваша покупка:__________");
        Product soldProduct1 = apparat.saleCoffee("Латте");
        System.out.println(soldProduct1);
        Product soldProduct2 = apparat.saleCoffee("Капучино");
        System.out.println(soldProduct2);
        System.out.print("К оплате: ");
        System.out.println(apparat.getCash());
        System.out.println("_________________________________");
        System.out.println(apparat);
    }
}
