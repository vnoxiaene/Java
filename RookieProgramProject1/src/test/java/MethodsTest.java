import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.platform.engine.discovery.MethodSelector;

public class MethodsTest {
    private final String name = "Name";
    private final double price = 1.0;
    private final String description = "Description";
    private final int quantity = 1;
    private final String category = "Category";

    Product testProduct = new Product(name,price,description,quantity,category);

    @Test
    public void testCreateAndSaveProduct(){
        Methods.createProduct(name, price, description,quantity,category);
        Assert.assertNotNull(Store.product);
    }

    @Test
    public void testListProducts(){
        Store.product.put(testProduct.getID(), testProduct);
        Methods.listProducts();
    }

    @Test
    public void testSearchProducts(){
        Store.product.put(testProduct.getID(), testProduct);
        Methods.searchByName("name");
    }







}
