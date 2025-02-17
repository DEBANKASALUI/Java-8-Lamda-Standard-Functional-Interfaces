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
        if (price > 1000) return true;
        else return false;
    }

    //   BiPredicate: boolean test(Object,Object)
    public boolean checkProduct(int id, String name) {
        if (id != 0) {
            return name.isEmpty();
        } else return false;
    }

    //    Supplier: Object get()
    public String returnProductName() {
        return "Bosch";
    }

    //    Function: Object apply(Object)
    public Integer returnProductNameLength(String pname) {
        return pname.length();
    }

    //    BiFunction: Object apply(Object,Object)
    public double returnDiscountedPrice(String productName, double price) {
        return productName.startsWith("S") ? (price * (15.0 / 100)) : price;
    }

    //  UnaryOperator: Double apply(Double)
    public double computePriceAfterFixedDiscount(double price) {
        return price + (price * (15.0 / 100));
    }

    //  BinaryOperator: Double apply(Double)
    public double computePriceAfterCustomDiscount(double price, double disc) {
        return price + (price * (disc / 100));
    }
}
