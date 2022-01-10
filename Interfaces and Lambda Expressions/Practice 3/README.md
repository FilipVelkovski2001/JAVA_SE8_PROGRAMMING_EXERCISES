# Lambda Expressions 

Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces

lambda expressions are added in Java 8 and provide below functionalities.

- Enable to treat functionality as a method argument, or code as data.
- A function that can be created without belonging to any class.
- A lambda expression can be passed around as if it was an object and executed on demand.

![](https://miro.medium.com/max/638/0*2Gqb-QxDKGNESn5f) 

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun()
	{
	System.out.println("Hello");
	}
}

class Test
{
	public static void main(String args[])
	{
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		FuncInterface fobj = (int x)->System.out.println(2*x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}
}

Output:

10

![](https://media.geeksforgeeks.org/wp-content/uploads/lambda-expression.jpg)

Syntax:

 lambda operator -> body

where lambda operator can be:

Zero parameter:
() -> System.out.println("Zero parameter lambda");
One parameter:–
(p) -> System.out.println("One parameter: " + p);
It is not mandatory to use parentheses, if the type of that variable can be inferred from the context

Multiple parameters :
(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
Please note: Lambda expressions are just like functions and they accept parameters just like functions.

Note that lambda expressions can only be used to implement functional interfaces. In the above example also, the lambda expression implements Consumer Functional Interface.

Important points:

- The body of a lambda expression can contain zero, one or more statements.
- When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression.
- When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type of the anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.