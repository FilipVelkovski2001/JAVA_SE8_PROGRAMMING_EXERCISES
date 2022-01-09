# Overriding in Java

In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. 
When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/overriding-in-java.png)

# Polymorphism in Java

The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. 
A person at the same time can have different characteristics. Like a man at the same time is a father, a husband, an employee. So the same person possesses different behavior in different situations. This is called polymorphism. 
Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. 
The word “poly” means many and “morphs” means forms, So it means many forms.

In Java polymorphism is mainly divided into two types: 

- Compile-time Polymorphism
- Runtime Polymorphism

Type 1: Compile-time polymorphism

It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 

Note: But Java doesn’t support the Operator Overloading.


![](http://media.geeksforgeeks.org/wp-content/uploads/OverridingVsOverloading.png)

Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. 
Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.

Type 2: Runtime polymorphism

It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. 
This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.


