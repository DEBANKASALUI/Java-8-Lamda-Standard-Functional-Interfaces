package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.BinaryOperator;

//A binary operator lambda in Java is a functional interface that takes two arguments of the same type and returns a result of the same type.
//The java.util.function.BinaryOperator<T> interface represents this concept.
//The apply method is used to apply the binary operator to two arguments.
public class SampleBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (num1, num2) -> num1 + num2;
        System.out.println(add.apply(10, 5));

        BinaryOperator<Double> product = (num1, num2) -> num1 * num2;
        System.out.println(product.apply(10.2, 2.5));
    }
}
