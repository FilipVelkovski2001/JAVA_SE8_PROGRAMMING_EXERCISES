# Bi-Predicate

The BiPredicate<T, V> interface was introduced in JDK 8. This interface is packaged in java.util.function package. 
It operates on two objects and returns a predicate value based on that condition. It is a functional interface and thus can be used in lambda expression also.

Methods:

- test(): This function evaluates a conditional check on the two objects, and returns a boolean value denoting the outcome.
boolean test(T obj, V obj1)

- and(): This function applies the AND operation on the current object and the object received as argument, and returns the newly formed predicate. This method has a default implementation.
default BiPredicate<T, V> and(BiPredicate<? super T, ? super V> other)

- negate(): This function returns the inverse of the current predicate i.e reverses the test condition. This method has a default implementation.
default BiPredicate<T, V> negate()
 
- or(): This function applies the OR operation on the current object and the object received as argument, and returns the newly formed predicate. This method has a default implementation.
default BiPredicate<T, V> or(BiPredicate<? super T, ? super V> other)