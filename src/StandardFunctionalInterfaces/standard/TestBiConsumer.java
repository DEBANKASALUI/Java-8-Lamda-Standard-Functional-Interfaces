package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,String>biConsumer=(pid,pname)->new Product().getProductDetails(pid,pname);
        biConsumer.accept(1001,"Samsung");
    }
}
