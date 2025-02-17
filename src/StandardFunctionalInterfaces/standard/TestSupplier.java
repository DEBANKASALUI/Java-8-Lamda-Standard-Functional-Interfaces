package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

//      It's not a good practice to tie Lambda to an object
//      Use TestFunction instead
        Supplier<String>supplier=()->new Product().returnProductName();
        System.out.println(supplier.get());
    }
}
