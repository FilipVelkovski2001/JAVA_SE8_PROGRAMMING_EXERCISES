# Deque

The Java Deque interface, java.util.Deque, represents a double ended queue, meaning a queue where you can add and remove elements to and from both ends of the queue. The name Deque is an abbreviation of Double Ended Queue. The word Deque is pronounced "deck" - like a "deck" of cards.

Because you can enqueue and dequeue from both ends of a Java Deque, you can use a Deque as both a queue and a stack. The Java Deque interface extends the Java Queue interface. That means that you can use all the Java Queue methods when working with a Deque. The Deque interface does not extend the Java Stack interface, but the Deque interface defines methods that enable you to do the same operations you would normally do on a stack (push, peek, pop).

![](https://www.tutorialandexample.com/wp-content/uploads/2019/09/Deque-in-Java.png)

Deque Implementations
Since Java Deque is an interface you need to instantiate a concrete implementation of the interface in order to use it. You can choose between the following Deque implementations in the Java Collections API:

java.util.LinkedList
java.util.ArrayDeque
The LinkedList class is a pretty standard Deque and Queue implementation. It uses a linked list internally to model a queue or a deque.

The Java ArrayDeque class stores its elements internally in an array. If the number of elements exceeds the space in the array, a new array is allocated, and all elements moved over. In other words, the ArrayDeque grows as needed, even if it stores its elements in an array.

Creating a Deque
Before you can use a Java Deque you must create an instance of one of the classes that implements the Deque interface. Here is an example of creating a Java Deque instance by creating a LinkedList instance:

Deque deque = new LinkedList();
Here is another example of creating a Java Deque by creating an ArrayDeque instance:

Deque deque = new ArrayDeque();
Generic Deque
By default you can put any Object into a Java Deque. However, using Java Generics it is possible to limit the types of object you can insert into a Deque. Here is an example:

Deque<MyObject> deque = new LinkedList<MyObject>();
This Deque can now only have MyObject instances inserted into it. You can then access and iterate its elements without casting them. Here is how it looks:

MyObject myObject = deque.remove();

for(MyObject anObject : deque){
   //do someting to anObject...
}
It is considered good practice to always specify a generic type when declaring a Java Deque variable. That way the compiler can help you check what types are inserted into the Deque and you don't have to cast the objects when you take them out of the Deque again. Also, it is more clear to the next person reading your code what type of objects this Deque is supposed to contain.

For more information about Java Generics, see the Java Generics Tutorial.

Add Element to Deque
As mentioned in the beginning of this Java Deque tutorial, you can add elements to both the beginning and end of a Deque. The Java Deque interface contains the following methods for adding elements to it:

add()
addLast()
addFirst()
offer()
offerFirst()
offerLast()
These methods will be explained in the following sections.

add()
You add elements to the beginning end of a Deque using the add() method. Here is an example of adding an element to the end (tail) of a Java Deque:

Deque<String> deque = new ArrayDeque<>();

deque.add("element 1");
If the element cannot be inserted into the Deque, the add() method will throw an exception. This is different from the offer() method, which will return false if it cannot insert the element.

The add() method is actually inherited from the Queue interface.

addLast()
The addLast() method also adds an element to the end (tail) of a Java Deque. This is the Deque interface's equivalent of the add() method inherited from the Queue interface. Here is an example of adding an element to a Java Deque instance using the addLast() method:

Deque<String> deque = new ArrayDeque<>();

deque.addLast("element 1");
If the element cannot be inserted into the Deque, the addLast() method will throw an exception. This is different from the offerLast() method which will return false if the element cannot be added to the Deque.

addFirst()
To add an element at the beginning (head) instead of the end of a Java Deque you call the addFirst() method instead. Here is an example of adding an element to the beginning (head) of a Java Deque:

Deque<String> deque = new ArrayDeque<>();

deque.addFirst("element 1");
If the element cannot be added to the beginning of the Deque, the addFirst() method will throw an exception. This is different from the offerFirst() method which will return false if an element cannot be inserted in the beginning of the Deque.

offer()
The offer() method adds an element to the end (tail) of the Deque. If adding the element succeeds the offer() method returns true. If the adding the element fails - e.g. if the Deque is full, the offer() method returns false. This is different from the add() method which will throw an exception is adding an element to the end of the Deque fails. Here is an example of how to add an element to the end of a Java Deque using the offer() method:

Deque<String> deque = new ArrayDeque<>();

deque.offer("element 1");
offerLast()
The offerLast() method adds an element to the end (tail) of the Deque, just like offer(). The method name offerLast() is just a bit more saying about where the element is added to the Deque. If adding the element succeeds the offerLast() method returns true. If the adding the element fails - e.g. if the Deque is full, the offerLast() method returns false. This is different from the addLast() method which will throw an exception is adding an element to the end of the Deque fails. Here is an example of how to add an element to the end of a Java Deque using the offerLast() method:

Deque<String> deque = new ArrayDeque<>();

deque.offerLast("element 1");
offerFirst()
The offerFirst() method adds an element to the beginning (head) of the Deque. If adding the element succeeds the offerFirst() method returns true. If the adding the element fails - e.g. if the Deque is full, the offerFirst() method returns false. This is different from the addFirst() method which will throw an exception is adding an element to the beginning of the Deque fails. Here is an example of how to add an element to the beginning of a Java Deque using the offerFirst() method:

Deque<String> deque = new ArrayDeque<>();

deque.offerFirst("element 1");
push()
The push() method adds an element to the beginning (head) of a Java Deque method. If adding the element fails, for instance if the Deque is full, the push() method will throw an exception. This is similar to how the addFirst() method works. Here is an example of adding an element to the beginning of a Java Deque using the push() method:

Deque<String> deque = new LinkedList<>();

deque.push("element 0");
Peek at Element in Deque
You can peek at the first and last elements of a Java Deque. Peeking at an element means obtaining a reference to the element without removing the element from the Deque. You can peek at the first and last element of a Java Deque using these methods:

peek()
peekFirst()
peekLast()
getFirst()
getLast()
Both of these methods will be covered in the following sections.

peek()
The peek() method returns the first element from the beginning (head) of a Java Deque without removing it. If the Deque is empty, peek() returns null. Here is an example of peeking at the first element of a Java Deque using the peek() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String firstElement = deque.peek();
After running this code the firstElement will point to the first String element added to the Deque: "first element".

peekFirst()
The peekFirst() method returns the first element from the beginning (head) of a Java Deque without removing it. If the Deque is empty, peekFirst() returns null. This is similar to how peek() works, but the method name peekFirst() is a bit more saying about which end of the Deque you peek at. Here is an example of peeking at the first element of a Java Deque using the peekFirst() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String firstElement = deque.peekFirst();
After running this code the firstElement will point to the first String element added to the Deque: "first element".

peekLast()
To peek at the last element of a Java Deque you can use the peekLast() method. If the Deque is empty, peekLast() will return null. Here is an example of peeking at the last element of a Java Deque using the peekLast() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String lastElement = deque.peekLast();
After running this Java example, the variable lastElement will point to the String last element - since that String was the last element added to the Deque.

getFirst()
The getFirst() method returns the first element from the beginning (head) of a Java Deque without removing it. If the Deque is empty, getFirst() throws an exception. Here is an example of peeking at the first element of a Java Deque using the getFirst() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");


String firstElement = deque.getFirst();
After running this code the firstElement will point to the first String element added to the Deque: "first element".

getLast()
To peek at the last element of a Java Deque you can use the getLast() method. If the Deque is empty, getLast() will return null. Here is an example of peeking at the last element of a Java Deque using the getLast() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("last element");

String lastElement = deque.getLast();
After running this Java example, the variable lastElement will point to the String last element - since that String was the last element added to the Deque.

Remove Element From Deque
To remove elements from a Java Deque, you can use one of the following methods:

remove()
removeFirst()
removeLast()
poll()
pollFirst()
pollLast()
Each of these methods will be explained in the following sections.

remove()
The remove() method removes the first element of a Java Deque. That is the element at the head of the Deque. The remove() method is actually inherited from the Queue interface. The remove() method returns the element that is removed from the Deque. Here is an example of removing the first element a Java Deque using the remove() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");

String removedElement = deque.remove();
If the Deque is empty, remove() will throw an exception. This is different from poll() which returns null if the Deque is empty.

removeFirst()
The removeFirst() method also removes the first element from a Deque - the element at the head of the Deque. Here is an example of removing the first element of a Java Deque using the removeFirst() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");

String removedElement = deque.removeFirst();
If the Deque is empty, removeFirst() will throw an exception. This is different from pollFirst() which returns null if the Deque is empty.

removeLast()
The removeLast() method removes the last element of a Deque - meaning the element at the tail of the Deque. Here is an example of removing the last element of a Java Deque using the removeLast() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

String removedElement = deque.removeLast();
After running this Java example the removedElement variable will point to the String object element 2 - since that element was the last element of the Deque when removeLast() was called.

If the Deque is empty, removeLast() will throw an exception. This is different from pollLast() which returns null if the Deque is empty.

poll()
The poll() method removes an element from the beginning of the Deque. If the Deque is empty, poll() returns null. This is different than remove() which throws an exception if the Deque is empty. Here is an example of removing the first element from a Java Deque using the poll() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

String removedElement = deque.poll();
pollFirst()
The pollFirst() method removes an element from the beginning of the Deque, just like poll(). The method name pollFirst() is just a bit more saying about from where the method removes elements. If the Deque is empty, pollFirst() returns null. This is different than removeFirst() which throws an exception if the Deque is empty. Here is an example of removing the first element from a Java Deque using the pollFirst() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

String removedElement = deque.pollFirst();
pollLast()
The pollLast() method removes an element from the end (tail) of the Deque. If the Deque is empty, pollLast() returns null. This is different than removeLast() which throws an exception if the Deque is empty. Here is an example of removing the last element from a Java Deque using the pollLast() method:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

String removedElement = deque.pollLast();
pop()
The pop() method removes an element from the beginning (head) of a Java Deque. If removing the element fails, for instance if the Deque is empty, the pop() method will throw an exception. This is similar to how the removeFirst() method works. Here is an example of removing the first element from a Java Deque using the pop() method:

Deque<String> deque = new LinkedList<>();

deque.push("element 0");

String removedElement = deque.pop();
Check if Deque Contains Element
You can use the Java Deque contains() method to check if a Deque contains a given element. The contains() method will return true if the Deque contains the element, and false if not. Here is an example of checking if a Java Deque contains a specific element using the contains() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");

boolean containsElement1 = deque.contains("first element");
boolean containsElement2 = deque.contains("second element");
After running this code the containsElement1 variable will have the value true because the Deque contains the Java String "first element", and the containsElement2 will contain the value false because the Deque does not contains the String element "second element".

Deque Size
The Java Deque size() method returns the number of elements stored in the Java Deque at the time you invoke the method. Here is an example of obtaining the number of elements in a Java Deque using its size() method:

Deque<String> deque = new ArrayDeque<>();

deque.add("first element");
deque.add("second element");

int size = deque.size();
After running this code the size variable will contain the value 2 because the Deque contains 2 element at the time size() is called.

Iterate Elements of Deque
You can also iterate all elements of a Java Deque, instead of just processing the elements one at a time. You can iterate the elements of a Deque in two ways:

Using an Iterator.
Using the for-each loop.
Both of these options will be explained in the following sections. Note, that the sequence in which the elements are obtained during iteration depends on the concrete Deque implementation. However, the method to iterate the elements is the same regardless of implementation.

Iterate Elements via Iterator
The first way of iterating the elements of a Deque is to obtain an Iterator from the Deque and iterate the elements via that. Here is an example of iterating the elements of a Java Deque via an Iterator:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

Iterator<String> iterator = deque.iterator();
while(iterator.hasNext(){
  String element = iterator.next();
}
Iterate Elements via For-Each Loop
The second way to iterate the elements of a Deque is to use the for-each loop in Java. Here is an example of iterating the elements of a Java Deque via the for-each loop:

Deque<String> deque = new LinkedList<>();

deque.add("element 0");
deque.add("element 1");
deque.add("element 2");

for(String element : deque) {
    System.out.println(element);
}