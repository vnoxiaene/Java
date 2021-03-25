
public class Product {

        private static int iterator = 1;

        final private int ID;
        private String name;
        private Double price;
        private String description;
        private int quantity;
        private String category;

    public Product(String name, Double price, String description, int quantity, String category) {
        this.ID = Product.iterator;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        Product.iterator += 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public String toString() {
            return "ID: " + this.getID() +
                    "\nName: " + this.getName() +
                    "\nPrice: " + this.getPrice()+
                    "\nDescription: " +this.getDescription()+
                    "\nQuantity: " +this.getQuantity()+
                    "\nCategory: " +this.getCategory();
    }
    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        String name = obj.toString();
        return this.toString().equals(name);

    }

}

