# Java enums

Enumerations serve the purpose of representing a group of named constants in a programming language. For example, the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an enumerated type named Suit. Other examples include natural enumerated types (like the planets, days of the week, colors, directions, etc.). 
Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc. It is not necessary that the set of constants in an enum type stay fixed for all time.

![](https://i.stack.imgur.com/WpViM.png)

In Java (from 1.5), enums are represented using enum data type. Java enums are more powerful than C/C++ enums. In Java, we can also add variables, methods and constructors to it. The main objective of enum is to define our own data types(Enumerated Data Types).

Declaration of enum in java :  

- Enum declaration can be done outside a Class or inside a Class but not inside a Method. 
- The first line inside the enum should be a list of constants and then other things like methods, variables and constructors.
- According to Java naming conventions, it is recommended that we name constant with all capital letters

Important points of enum :  

- Every enum is internally implemented by using Class. 
- Every enum constant represents an object of type enum.
- enum type can be passed as an argument to switch statement. 
- Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. Since it is final, we can’t create child enums.
- We can declare the main() method inside the enum. Hence we can invoke enum directly from the Command Prompt. 

Enum and Inheritance :  

- All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum cannot extend anything else.
- toString() method is overridden in java.lang.Enum class, which returns enum constant name.
- enum can implement many interfaces.

values(), ordinal() and valueOf() methods :  

- These methods are present inside java.lang.Enum.
- values() method can be used to return all values present inside enum.
- Order is important in enums.By using ordinal() method, each enum constant index can be found, just like array index.
- valueOf() method returns the enum constant of the specified string value, if exists.

enum and constructor :  

- enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
- We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.

 enum and methods :  

- enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance of the enum class must implement it 

## Enum with Customized Value in Java

By default enums have their own string values, we can also assign some custom values to enums. Consider below example for that.

enum  Fruits
{
    APPLE(“RED”), BANANA(“YELLOW”), GRAPES(“GREEN”);
}

In above example we can see that the Fruits enum have three members i.e APPLE, BANANA and GRAPES with have their own different custom values RED, YELLOW and GREEN respectively.

Now to use this enum in code, there are some points we have to follow:-

We have to create parameterized constructor for this enum class. Why? Because as we know that enum class’s object can’t be create explicitly so for initializing we use parameterized constructor. And the constructor cannot be the public or protected it must have private or default modifiers. Why? if we create public or protected, it will allow initializing more than one objects. This is totally against enum concept.
We have to create one getter method to get the value of enums.

// Java program to demonstrate how values can
// be assigned to enums.
enum TrafficSignal
{
	// This will call enum constructor with one
	// String argument
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

	// declaring private variable for getting values
	private String action;

	// getter method
	public String getAction()
	{
		return this.action;
	}

	// enum constructor - cannot be public or protected
	private TrafficSignal(String action)
	{
		this.action = action;
	}
}

// Driver code
public class EnumConstructorExample
{
	public static void main(String args[])
	{
		// let's print name of each enum and there action
		// - Enum values() examples
		TrafficSignal[] signals = TrafficSignal.values();

		for (TrafficSignal signal : signals)
		{
			// use getter method to get the value
			System.out.println("name : " + signal.name() +
						" action: " + signal.getAction() );
		}
	}
}

Output:

name : RED action: STOP
name : GREEN action: GO 
name : ORANGE action: SLOW DOWN 


