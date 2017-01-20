import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by andykim on 1/19/17.
 */
public class inventoryTest {

    Inventory store;
    Product banana;
    Product apple;
    Product bread;
    Product banana2;

    @Before
    public void setUp() {

        store = new Inventory();
        banana = new Product(3,1);
        apple = new Product(3,2);
        bread = new Product(1,3);
        banana2 = new Product(3,1);
        store.inventory.add(banana);
    }


    @Test


    public void test1(){
        int expected = 2;
        int actual = store.countProducts(1);
        assertEquals(expected, actual, 0);
    }

}
