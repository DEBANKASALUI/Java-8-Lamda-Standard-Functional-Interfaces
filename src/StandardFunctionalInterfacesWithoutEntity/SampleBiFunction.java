package StandardFunctionalInterfacesWithoutEntity;

import java.util.function.BiFunction;

//A BiFunction in Java is a functional interface that represents a function that accepts two arguments and produces a result.
//The apply method is used to apply the BiFunction to the given arguments.
public class SampleBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>add=(num1,num2)->num1+num2;
        System.out.println(add.apply(10,20));

        BiFunction<String,String,String>concatStr=(s1,s2)->s1.concat(s2);
        BiFunction<String,String,Integer>concatStrLen=(s1,s2)->s1.concat(s2).length();

        System.out.println(concatStr.apply("hi"," All"));
        System.out.println(concatStrLen.apply("hi"," All"));
    }
}
