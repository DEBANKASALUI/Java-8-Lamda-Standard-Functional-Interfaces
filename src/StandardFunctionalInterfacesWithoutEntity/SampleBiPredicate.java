package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.BiPredicate;

//A BiPredicate in Java is a functional interface that represents a predicate (boolean-valued function) that takes two arguments.
//The test method is used to apply the BiPredicate to the given arguments.
public class SampleBiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer>areBothEven=(num1,num2)->(num1%2==0)&&(num2%2==0);
        System.out.println(areBothEven.test(4,6));
        System.out.println(areBothEven.test(5,6));

        BiPredicate<String, String>areBothEqualLength=(s1,s2)->s1.length()==s2.length();
        System.out.println(areBothEqualLength.test("hello","Helloguys"));
        System.out.println(areBothEqualLength.test("hello","world"));

    }
}
