import java.util.List;

public interface InventoryManagerInterface {
    int number = 8;
    default void show(){
        System.out.println("default method inside interface");
    }
    static void showStaticMethod(){
        System.out.println("Static method inside the interface");
    }

    Product addProducts(Product p);

    List<Product> removeProducts(int id, List<Product> p);

    Product getAllProductDataFromUser();

    Product searchProduct(int id);

}
