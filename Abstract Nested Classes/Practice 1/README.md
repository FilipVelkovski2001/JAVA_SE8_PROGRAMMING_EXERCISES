# Abstract Classes

In C++, if a class has at least one pure virtual function, then the class becomes abstract. Unlike C++, in Java, a separate keyword abstract is used to make a class abstract. 

Following are some important observations about abstract classes in Java:

- An instance of an abstract class can not be created.
- Constructors are allowed.
- We can have an abstract class without any abstract method.
- Abstract classes can not have final methods because when you make a method final you can not override it but the abstract methods are meant for overriding.
- We are not allowed to create object for any abstract class.
- We can define static methods in an abstract class.

![](https://media.geeksforgeeks.org/wp-content/uploads/Abstract-Class-vs-Interface.png)