package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double>binaryOperator=(p,disc)->new Product().computePriceAfterCustomDiscount(p,disc);
        System.out.println(binaryOperator.apply(1000.0,10.0));
    }
}
