# Multithreading in Java

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms : 

Extending the Thread class 
Implementing the Runnable Interface
Thread creation by extending the Thread class
We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.

```

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
    }
}

```

```

Output
Thread 15 is running
Thread 14 is running
Thread 16 is running
Thread 12 is running
Thread 11 is running
Thread 13 is running
Thread 18 is running
Thread 17 is running

```

Thread creation by implementing the Runnable Interface
We create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object. 
 
```

// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}

```

```

Output
Thread 13 is running
Thread 11 is running
Thread 12 is running
Thread 15 is running
Thread 14 is running
Thread 18 is running
Thread 17 is running
Thread 16 is running

```

Thread Class vs Runnable Interface 

If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
Using runnable will give you an object that can be shared amongst multiple threads. 
This article is contributed by Mehak Narang. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above


## Java Concurrency

Java Concurrency package covers concurrency, multithreading, and parallelism on the Java platform. Concurrency is the ability to run several or multi programs or applications in parallel. The backbone of Java concurrency are threads (a lightweight process, which has its own files and stacks and can access the shared data from other threads in the same process). The throughput and the interactivity of the program can be improved by performing time-consuming tasks asynchronously or in parallel

Java 5 added a new package to the java platform ⇾ java.util.concurrent package. This package has a set of classes and interfaces that helps in developing concurrent applications (multithreading) in java. Before this package, one needs to make the utility classes of their need on their own. 

Main Components/Utilities of this package:
We will discuss some of the most useful utilities from this package.

1.  Executor 

Executor is a set of interfaces that represents an object whose implementation executes tasks. It depends on the implementation whether the task should be run on a new thread or on a current thread. Hence, we can decouple the task execution flow from the actual task execution mechanism, using this interface. Executor does not require the task execution to be asynchronous. The simplest of all is the executable interface.

2.  ExecutorService

ExecutorService is an interface and only forces the underlying implementation to implement execute() method. It extends the Executor interface and adds a series of methods that execute threads that return a value. The methods to shut the thread pool as well as the ability to implement for the result of the execution of the task.
For the creation of single-threaded ExecutorService instance, we can use newSingleThreadExecuter(ThreadFactory threadfactory) for creating the instance. After the executor is created, we can submit the task.

Two out-of-the-box termination methods are:

shutdown(): It waits till all the submitted tasks execution gets finished.
shutdownNow(): It immediately terminates all the executing/pending tasks.
There is one more method that is awaitTermination() which forcefully blocks until all tasks have completed execution after a shutdown event-triggered or execution-timeout occurred, or the execution thread itself is interrupted.

3.  ScheduledExecutorService

It is similar to ExecutorService. The difference is that this interface can perform tasks periodically. Both Runnable and Callable function is used to define the task.

Here,

scheduleAtFixedRate( Runnable command, long initialDelay, long period, TimeUnit unit): This method creates and executes a periodic action that is first invoked after the initial delay and subsequently with the given period until the service instance shutdowns.
scheduleWithFixedDelay( Runnable command, long initialDelay, long delay, TimeUnit unit): This method creates and executes a periodic action that is invoked firstly after the provided initial delay and repeatedly with the given delay between the termination of the executing one and the invocation f the next one.
4.  Future

It represents the result of an asynchronous operation. The methods in it check if the asynchronous operation is completed or not, gets the completed result, etc. The cancel(boolean isInterruptRunning) API cancels the operation and releases the executing thread. On the value of isInterruptRunning value being true, the thread executing the task will be terminated instantly. Otherwise, all the in-progress tasks get completed.

Code snippet creates an instance of Future.

Timeout specification for a given operation. If the time taken is more than this time, then TimeoutException is thrown.

5.  CountDownLatch

It is a utility class that blocks a set of threads until some operations get completed. A CountDownLatch is initialized with a counter(which is of Integer type). This counter decrements as the execution of the dependent threads get completed. But once the counter decrements to zero, other threads get released.

6.  CyclicBarrier

CyclicBarrier is almost the same as CountDownLatch except that we can reuse it. It allows multiple threads to wait for each other using await() before invoking the final task and this feature is not in CountDownLatch.

We are required to create an instance of Runnable Task to initiate the barrier condition.

7.  Semaphore


It is used for blocking thread-level access to some part of the logical or physical resource. Semaphore contains a set of permits. Wherever the thread tries to enter the code part of a critical section, semaphore gives the permission whether the permit is available or not, means the critical section is available or not. If the permit is not available, then the thread cannot enter the critical section.

It is basically a variable named counter which maintains the count of entering and leaving threads from the critical section. When the executing thread releases the critical section, the counter increases.

Semaphores can be used to implement a Mutex like data structure.

8.  ThreadFactory

It acts as a thread pool which creates a new thread on demand.

9. BlockingQueue

BlockingQueue interface supports flow control (in addition to queue) by introducing blocking if either BlockingQueue is full or empty. A thread trying to enqueue an element in a full queue is blocked until some other thread makes space in the queue, either by dequeuing one or more elements or clearing the queue completely. Similarly, it blocks a thread trying to delete from an empty queue until some other threads insert an item. BlockingQueue does not accept a null value. If we try to enqueue the null item, then it throws NullPointerException.

10. DelayQueue

DelayQueue is a specialized Priority Queue that orders elements based on their delay time. It means that only those elements can be taken from the queue whose time has expired. DelayQueue head contains the element that has expired in the least time. If no delay has expired, then there is no head and poll will return null. DelayQueue accepts only those elements that belong to a class of type Delayed. DelayQueue implements the getDelay() method to return the remaining delay time.

11.  Lock

It is a utility for blocking other threads from accessing a certain segment of code. The difference between Lock and a Synchronized block is that we have Lock APIs lock() and unlock() operation in separate methods whereas Synchronized block is fully contained in methods.

12.  Phaser

It is more flexible than CountDownLatch and CyclicBarrier. Phaser is used to act as a reusable barrier on which the dynamic number of threads needs to wait before the execution continues. Multiple phases of execution can be coordinated by reusing the instance of Phaser for each program phase.

