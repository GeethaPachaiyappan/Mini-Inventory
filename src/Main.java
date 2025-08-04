import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Inventory Mini Project - testing commit
        char check;
        int n = 0;
        int id = 0;

        Scanner sc = new Scanner(System.in);


        InventoryManagerInterface inventory = new InventoryManager();

        // default method in interface
        inventory.show();

        // static method in interface
        InventoryManagerInterface.showStaticMethod();

        // variable in interface
        System.out.println(InventoryManagerInterface.number);



        do{
            System.out.println("Mini - Inventory Management System");
            System.out.println( "1. Add Product");
            System.out.println( "2. Product List");
            System.out.println( "3. Remove Product");
            System.out.println( "4. Search Product");
            System.out.println( "5. Exit");
            n = sc.nextInt();
            sc.nextLine();

            switch (n){
                case 1:
                    // add products
                    Product.listOfProducts.add(inventory.addProducts(inventory.getAllProductDataFromUser()));
                    System.out.println(Product.listOfProducts);
                    break;
                case 2:
                    // List All Products
                    for (Product p : Product.listOfProducts){
                        System.out.println(p + "\n");
                    }
                    break;
                case 3:
                    //remove product
                    System.out.println("Enter Product id to remove: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println(inventory.removeProducts(id,Product.listOfProducts));
                    break;
                case 4:
                    //Search Product Using id
                    System.out.println("Enter Product id to search: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    if(inventory.searchProduct(id) != null)
                        System.out.println(inventory.searchProduct(id));
                    else
                        System.out.println("No Data found");
                    break;
                case 5:
                    //Exit
                    break;
                default:
                    System.out.println("check the input");

            }
            System.out.println("Do you want to continue(Y/N): ");
            check = sc.next().charAt(0);
        }while (check == 'Y');



       

    }
}