
public class Methods {

    public static Product saveProduct(String name, double price, String description, int quantity, String category){
        Product product = new Product(name,price,description,quantity,category);
        Store.product.put(product.getID(), product);
        return product;
    }


    public static void createProduct(String name,double price, String description,
                                     int quantity,String category) {
        Product product = saveProduct(name,price,description,quantity,category);
        System.out.println("The product " +product.getName() + " has been created succeed.");
    }

    public static void listProducts() {
        if (Store.product.size()>0){
            System.out.println("All products listed");
            System.out.println("======================");
            for (Integer key: Store.product.keySet()){
                Product product = Store.product.get(key);
                System.out.println(product);
                System.out.println();
            }
        }else{
            System.out.println("Nothing Registered, Create a new product.");
        }

    }

    public static void searchByName(String nameProduct) {
        if (Store.product.size()>0){
            for (Integer key: Store.product.keySet()){
                Product product = Store.product.get(key);
                if (product.getName().equalsIgnoreCase(nameProduct) || product.getName().startsWith(nameProduct)){
                    System.out.println("Product Name: "+product.getName()+"\nPrice: "+product.getPrice()+
                            "\nDescription: "+product.getDescription());
                    System.out.println();
                }
            }
        }else{
            System.out.println("Nothing Registered, Create a new product.");
        }

    }
}
