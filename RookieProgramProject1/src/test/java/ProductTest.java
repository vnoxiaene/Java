import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {
    @Test
    public void testCreateProduct(){
        Product testProduct = new Product("name", 1.0, "description", 1, "Category");
        Map<Integer,Product> mapProduct = new HashMap<>();
        Assert.assertEquals(0,mapProduct.size());
        mapProduct.put(testProduct.getID(), testProduct);
        Assert.assertEquals(1,mapProduct.size());
    }

    @Test
    public void testSetter(){
        Product testProduct = new Product("name", 1.0, "description", 1, "Category");
        testProduct.setCategory("category");
        testProduct.setDescription("descri");
        testProduct.setPrice(2.0);
        testProduct.setName("Name2");
        testProduct.setQuantity(4);
        Assert.assertEquals("Name2",testProduct.getName());
        Assert.assertEquals(2.0,testProduct.getPrice(), 0.001);
        Assert.assertEquals("descri",testProduct.getDescription());
        Assert.assertSame(4,testProduct.getQuantity());
        Assert.assertEquals("category",testProduct.getCategory());
    }

    @Test
    public void testEquals(){
        Product testProduct = new Product("name", 1.0, "description", 1, "Category");
        Product testProduct2 = new Product("name", 1.0, "description", 1, "Category");

        Assert.assertTrue(testProduct.getName().equals(testProduct2.getName()));

    }
}
