package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consume = (pname) -> new Product().getProductUpper(pname);
        consume.accept("samsung");

        Consumer<String> consumer=(pname)->new Product().getProductNameLength(pname);
        consumer.accept("bosch");
    }
}
