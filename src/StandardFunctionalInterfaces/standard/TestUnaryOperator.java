package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Double> unaryOperator = (price) -> new Product().computePriceAfterFixedDiscount(price);
        System.out.println(unaryOperator.apply(1000.0));
    }
}
