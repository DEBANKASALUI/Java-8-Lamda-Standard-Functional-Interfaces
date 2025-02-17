package StandardFunctionalInterfacesWithoutEntity;

import java.util.ArrayList;
import java.util.function.Consumer;

//A Consumer in Java is a functional interface that represents an operation that accepts a single input argument and returns no result.
//The accept method is used to apply the Consumer to the given argument.
public class SampleConsumer {
    public static void main(String[] args) {

        Consumer<String>printmsg=(s)-> System.out.println(s);
        printmsg.accept("Hello World!");

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Consumer<Integer> multi=(num)-> System.out.println(num*10);
        list.forEach(multi);
    }
}
