package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        Function<Product, String> stringFunction = (p) -> p.returnProductName();
        String name = stringFunction.apply(new Product());
        System.out.println(name);

//      Its not a good practice to tie Lambda to an object
//      This can be resolved by using accept() of Function by passing the object and data to the Lambda as in TestBiFunction
        Function<String, Integer> function = (pname) -> new Product().returnProductNameLength(pname);
        Integer len = function.apply("Hitachi");
        System.out.println(len);
    }
}
