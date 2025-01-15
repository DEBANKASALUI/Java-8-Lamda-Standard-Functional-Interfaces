package LambaAnonymousClasses;

public class Tester1 {
    public static void main(String[] args) {
        ArithmeticOperationExecutor executor = new ArithmeticOperationExecutor();
        int num = 45;

//      Lambda expression: pure First order function
        ArithmeticOperation operation = (num1, num2) -> {
//          System.out.println(this);
            return num1 + num2;
//          return num*(num1+num2);
        };
        int resultLambda = executor.execute(operation, 10, 30);
        System.out.println(resultLambda);

//      Reduced Lambda
        int resultReduced=executor.execute((num1, num2) -> (num1+num2)*num,10,30);
        System.out.println(resultReduced);

//      Anonymous Class: impure First Order Function
        ArithmeticOperation operationAnym = new ArithmeticOperation() {
            @Override
            public int calculate(int num1, int num2) {
                System.out.println(this);
                return num1 * num2;
            }
        };
        int resultAnym = executor.execute(operationAnym, 10, 30);
        System.out.println(resultAnym);
    }
}
// Point Anonymous class is both object and definition
// whereas Lambda is just definition

// Anonymous class has the capability to overwrite this reference
// whereas Lambdas use this reference from outer scope and cannot re-write

//Hence Lambda is not replacement of Anonymous class
