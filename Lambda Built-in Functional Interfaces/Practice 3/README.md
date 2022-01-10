# Supplier

The Java Supplier interface is a functional interface that represents an function that supplies a value of some sorts. The Supplier interface can also be thought of as a factory interface. Here is an example implementation of the Java Supplier interface:

Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
This Java Supplier implementation returns a new Integer instance with a random value between 0 and 1000.