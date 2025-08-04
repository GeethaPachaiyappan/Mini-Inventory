import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManager implements InventoryManagerInterface{



    @Override
    public Product addProducts(Product p) {
        return p;

    }

    @Override
    public List<Product> removeProducts(int id, List<Product> p) {
        for (Product p1 : p){
            if(p1.getId() == id){
                p.remove(p1);
                break;
            }
        }
        return p;
    }

    public Product getAllProductDataFromUser(){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Enter Product id: ");
        p.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Product name: ");
        p.setName(sc.nextLine());
        System.out.println("Enter Category: ");
        p.setCategory(sc.nextLine());
        System.out.println("Enter price: ");
        p.setPrice(sc.nextDouble());
        System.out.println("Enter quantity");
        p.setQuantity(sc.nextInt());
        return p;
    }

    @Override
    public Product searchProduct(int id) {
        for( Product p : Product.listOfProducts){
            if(id == p.getId())
                return p;
        }
        return null;
    }
}
