package StandardFunctionalInterfaces.entity;

public class Product {

    //   Consumer: void accept(Object)
    public void getProductUpper(String name) {
        System.out.println(name.toUpperCase());
    }

    public void getProductNameLength(String pname) {
        System.out.println(pname.length());
    }

    //   BiConsumer: void accept(Object,Object)
    public void getProductDetails(int id, String name) {
        System.out.println("Product details: id= " + id + ", name: " + name);
    }

    //   Predicate: boolean test(Object)
    public boolean checkPrice(double price) {
        if(price > 1000)return true;
        else return false;
    }

//   BiPredicate: boolean test(Object,Object)


//    Supplier: Object get()


//    Function: Object apply(Object)


//    BiFunction: Object apply(Object,Object)


//  UnaryOperator: Double apply(Double)


//  BinaryOperator: Double apply(Double)


}
