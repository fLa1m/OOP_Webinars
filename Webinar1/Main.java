/*Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, 
содержащий в себе методы initProducts (List <Product>) сохраняющий в себе 
список исходных продуктов и getProduct(String name) */

package Webinar1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new WaterBottle("BonAqua", 50);
        Product redKey = new WaterBottle("RedKey", 60);
        LinkedList<Product> list = new LinkedList<>();
        list.add(bonAqua);
        list.add(redKey);
        wvm.putProduct(list);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
    }
}