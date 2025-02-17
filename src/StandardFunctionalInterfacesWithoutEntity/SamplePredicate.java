package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.Predicate;

//A Predicate in Java is a functional interface that represents a single argument function that returns a boolean value.
//The test method is used to apply the Predicate to the given argument.
public class SamplePredicate {
    public static void main(String[] args) {
        Predicate<Integer>checkEven=(num)->num%2==0;
        System.out.println(checkEven.test(23));
        System.out.println(checkEven.test(20));

        Predicate<String>checkEmpty=(s)->s.isEmpty();
        System.out.println(checkEmpty.test(""));
        System.out.println(checkEmpty.test("Hi"));
    }
}
