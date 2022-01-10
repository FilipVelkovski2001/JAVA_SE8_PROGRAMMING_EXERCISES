# Java Consumer

The Consumer Interface is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which takes in one argument and produces a result. However these kind of functions don’t return any value.
Hence this functional interface which takes in one generic namely:- 
 

T: denotes the type of the input argument to the operation
The lambda expression assigned to an object of Consumer type is used to define its accept() which eventually applies the given operation on its argument. Consumers are useful when it not needed to return any value as they are expected to operate via side-effects. 

Functions in Consumer Interface
The Consumer interface consists of the following two functions:
 
1. accept()

This method accepts one value and performs the operation on the given argument

Syntax: 
 

void accept(T t)
Parameters: This method takes in one parameter: 
 

t– the input argument
Returns: This method does not return any value.

2. andThen()

It returns a composed Consumer wherein the parameterized Consumer will be executed after the first one. If evaluation of either function throws an error, it is relayed to the caller of the composed operation.
Note: The function being passed as the argument should be of type Consumer.
Syntax: 
 

default Consumer <T> 
        andThen(Consumer<? super T> after)

Parameters: This method accepts a parameter after which is the Consumer to be applied after the current one.
Return Value: This method returns a composed Consumer that first applies the current Consumer first and then the after operation.
Exception: This method throws NullPointerException if the after operation is null.

