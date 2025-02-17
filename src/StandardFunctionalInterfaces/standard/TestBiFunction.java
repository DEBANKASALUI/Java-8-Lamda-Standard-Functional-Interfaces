package StandardFunctionalInterfaces.standard;

import StandardFunctionalInterfaces.entity.Product;

import java.util.function.BiFunction;

public class TestBiFunction {
    public static void main(String[] args) {

        BiFunction<Product,String,Integer>biFunction=(product, pname) ->product.returnProductNameLength(pname);
        Integer len=biFunction.apply(new Product(),"Voltas");
        System.out.println(len);

        BiFunction<String,Double,Double>biFunction1=(pname,dprice)->new Product().returnDiscountedPrice(pname,dprice);
        Double price=biFunction1.apply("Samsung",50000.2);
        System.out.println(price);
        
    }
}
