package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.Function;

//A Function in Java is a functional interface that represents a function that accepts one argument and produces a result.
//The apply method is used to apply the Function to the given argument.
public class SampleFunction {
    public static void main(String[] args) {
        Function<String,Integer>lenCalculate=(s)->s.length();
        System.out.println(lenCalculate.apply("hello World"));
    }
}
