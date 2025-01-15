package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate=(price)->new Product().checkPrice(price);
        Boolean r=predicate.test(2000);
        System.out.println(r);
    }
}
