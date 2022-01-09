# Java Nested Classes

In Java, it is possible to define a class within another class, such classes are known as nested classes. They enable you to logically group classes that are only used in one place, thus this increases the use of encapsulation, and creates more readable and maintainable code.

The scope of a nested class is bounded by the scope of its enclosing class. Thus in above example, class NestedClass does not exist independently of class OuterClass.
A nested class has access to the members, including private members, of the class in which it is nested. However, the reverse is not true i.e., the enclosing class does not have access to the members of the nested class.
A nested class is also a member of its enclosing class.
As a member of its enclosing class, a nested class can be declared private, public, protected, or package private(default).
Nested classes are divided into two categories:
- static nested class : Nested classes that are declared static are called static nested classes.
- inner class : An inner class is a non-static nested class.

![](https://media.geeksforgeeks.org/wp-content/uploads/d3.jpeg)

In the case of normal or regular inner classes, without an outer class object existing, there cannot be an inner class object. i.e., an object of the inner class is always strongly associated with an outer class object. But in the case of static nested class, Without an outer class object existing, there may be a static nested class object. i.e., an object of a static nested class is not strongly associated with the outer class object.
As with class methods and variables, a static nested class is associated with its outer class. And like static class methods, a static nested class cannot refer directly to instance variables or methods defined in its enclosing class: it can use them only through an object reference.
They are accessed using the enclosing class name.

1.	Without an outer class object existing, there cannot be an inner class object. That is, the inner class object is always associated with the outer class object.	Without an outer class object existing, there may be a static nested class object. That is, static nested class object is not associated with the outer class object.
2.	Inside normal/regular inner class, static members can’t be declared.	Inside static nested class, static members can be declared.
3.	As main() method can’t be declared, regular inner class can’t be invoked directly from the command prompt.	As main() method can be declared, the static nested class can be invoked directly from the command prompt.
4.	Both static and non static members of outer class can be accessed directly.	Only a static member of outer class can be accessed directly.
