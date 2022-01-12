# Paralell Streams

Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor. Normally any java code has one stream of processing, where it is executed sequentially. Whereas by using parallel streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes. The order of execution, however, is not under our control.

Therefore, it is advisable to use parallel streams in cases where no matter what is the order of execution, the result is unaffected and the state of one element does not affect the other as well as the source of the data also remains unaffected.

![](https://media.geeksforgeeks.org/wp-content/uploads/20200731200622/SequentialVsParallelStream.jpg)

Why Parallel Streams?
Parallel Streams were introduced to increase the performance of a program, but opting for parallel streams isn’t always the best choice. There are certain instances in which we need the code to be executed in a certain order and in these cases, we better use sequential streams to perform our task at the cost of performance. The performance difference between the two kinds of streams is only of concern for large-scale programs or complex projects. For small-scale programs, it may not even be noticeable. Basically, you should consider using Parallel Streams when the sequential stream behaves poorly.

Ways to Create Stream 
There are two ways we can create which are listed below and described later as follows:

Using parallel() method on a stream
Using parallelStream() on a Collection 
Method 1: Using parallel() method on a stream

The parallel() method of the BaseStream interface returns an equivalent parallel stream. Let us explain how it would work with the help of an example.

In the code given below, we create a file object which points to a pre-existent ‘txt’ file in the system. Then we create a Stream that reads from the text file one line at a time. Then we use the parallel() method to print the read file on the console. The order of execution is different for each run, you can observe this in the output. The two outputs given below have different orders of execution.

Method 2: Using parallelStream() on a Collection

The parallelStream() method of the Collection interface returns a possible parallel stream with the collection as the source. Let us explain the working with the help of an example.

Implementation:

In the code given below, we are again using parallel streams but here we are using a List to read from the text file. Therefore, we need the parallelStream() method.