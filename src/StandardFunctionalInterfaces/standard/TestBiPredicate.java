package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,String>biPredicate=(id,name)->new Product().checkProduct(id,name);
        boolean r=biPredicate.test(1001,"Samsung");
        System.out.println(r);
    }
}
