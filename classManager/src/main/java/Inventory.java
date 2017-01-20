import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by andykim on 1/19/17.
 */
public class Inventory {

    ArrayList<Product> inventory = new ArrayList<Product>();


    public int countProducts(int id){
        int quantity = 0;
        for(Product product : inventory){
            if(id == product.id){
                quantity++;
            }

        }
        return quantity;
    }




}
