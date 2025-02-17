package StandardFunctionalInterfacesWithoutEntity;

import java.util.Random;
import java.util.function.Supplier;

//A Supplier in Java is a functional interface that represents a supplier of results.
//The get method is used to retrieve the generated value from the Supplier.
public class SampleSupplier {
    public static void main(String[] args) {
        Supplier<Integer>getRandomNumber=()->new Random().nextInt(100);
        System.out.println("Random Number:"+getRandomNumber.get());

        Supplier<String>getMsg=()->"Hello World!";
        System.out.println(getMsg.get());
    }
}
