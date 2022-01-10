Function
The Java Function interface (java.util.function.Function) interface is one of the most central functional interfaces in Java. The Function interface represents a function (method) that takes a single parameter and returns a single value. Here is how the Function interface definition looks:

public interface Function<T,R> {

    public <R> apply(T parameter);
}
The Function interface actually contains a few extra methods in addition to the methods listed above, but since they all come with a default implementation, you do not have to implement these extra methods. The extra methods will be explained in later sections.

The only method you have to implement to implement the Function interface is the apply() method. Here is a Function implementation example:

public class AddThree implements Function<Long, Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}
This Function implementation implements the apply() method so it takes a Long as parameter, and returns a Long. Here is an example of using the above AddThree class:

Function<Long, Long> adder = new AddThree();
Long result = adder.apply((long) 4);
System.out.println("result = " + result);
First this example creates a new AddThree instance and assigns it to a Function variable. Second, the example calls the apply() method on the AddThree instance. Third, the example prints out the result (which is 7).

You can also implement the Function interface using a Java lambda expression. Here is how that looks:

Function<Long, Long> adder = (value) -> value + 3;
Long resultLambda = adder.apply((long) 8);
System.out.println("resultLambda = " + resultLambda);
As you can see, the Function interface implementation is now inlined in the declaration of the adderLambda variable, rather than in a separate class. This is a bit shorter, plus we can see directly in the above code what it is doing.