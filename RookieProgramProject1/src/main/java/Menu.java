
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    static Scanner tc = new Scanner(System.in);

    public static void menu() {
        System.out.println("=========================================");
        System.out.println("=============== Welcome ============");
        System.out.println("=========================================");

        System.out.println("Selection an option: ");
        System.out.println("1 - Create new product");
        System.out.println("2 - List all products");
        System.out.println("3 - Search by name");
        System.out.println("4 - Exit");

        int option = 0;

        try {
            option = Integer.parseInt(tc.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid Option");
            Menu.menu();
        }

        switch (option) {
            case 1:
                System.out.println("Create new product");
                System.out.println("====================");
                System.out.println("Product name: ");
                String name = tc.nextLine();
                System.out.println("Product price: ");
                double price = 0.0;
                try {
                    price = Double.parseDouble(tc.nextLine());
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Invalid Price");
                    Menu.menu();
                }
                System.out.println("Description of the Product: ");
                String description = tc.nextLine();

                System.out.println("Quantity available: ");
                int quantity = 0;
                try {
                    quantity = Integer.parseInt(tc.nextLine());
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Invalid Quantity");
                    Menu.menu();
                }
                System.out.println("Product category: ");
                String category = tc.nextLine();
                Methods.createProduct(name,price,description,quantity,category);
                Menu.menu();
                break;
            case 2:
                Methods.listProducts();
                Menu.menu();
                break;
            case 3:
                System.out.println("What is the product that you are looking for?");
                System.out.println("=============================================");
                String nameProduct = tc.nextLine();
                Methods.searchByName(nameProduct);
                Menu.menu();
                break;
            case 4:
                System.out.println("Thank you for use the system.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option.");
                Menu.menu();
                break;
        }
    }
}
