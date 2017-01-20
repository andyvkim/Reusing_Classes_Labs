/**
 * Created by andykim on 1/19/17.
 */
public class Main {

    public static void main(String[] args){

        Product banana = new Product(3, 1);

        Product apple = new Product(4, 2);

        Product cookie = new Product(1,3);

        Product banana2 = new Product(3,1);

        Inventory store = new Inventory();

        store.inventory.add(banana);

        store.inventory.add(apple);

        store.inventory.add(cookie);

        store.inventory.add(banana2);

        System.out.println(store.inventory);

        System.out.println(store.countProducts(1));



    }
}
