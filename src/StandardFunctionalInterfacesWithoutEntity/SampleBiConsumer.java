package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.BiConsumer;

//A BiConsumer in Java is a functional interface that represents an operation that accepts two input arguments and returns no result.
//It is part of the java.util.function package.
//The accept method is used to apply the BiConsumer to the given arguments.
public class SampleBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer>add=(num1,num2)-> System.out.println(num1+num2);
        add.accept(10,20);
    }
}
