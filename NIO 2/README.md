# Java NIO

Java IO(Input/Output) is used to perform read and write operations. The java.io package contains all the classes required for input and output operation. Whereas, Java NIO (New IO) was introduced from JDK 4 to implement high-speed IO operations. It is an alternative to the standard IO API’s.

In this article, we will understand more about Java NIO.

Java NIO(New Input/Output) is high-performance networking and file handling API and structure which works as an alternative IO API for Java. It is introduced from JDK 4. Java NIO works as the second I/O system after standard Java IO with some added advanced features. It provides a different way of working with I/O than the standard IO. Like Java.io package which contains all the classes required for Java input and output operations, the java.nio package defines the buffer classes which are used throughout NIO APIs. We use Java NIO for the following two main reasons:

Non-blocking IO operation: Java NIO performs non-blocking IO operations. This means that it reads the data whichever is ready. For instance, a thread can ask a channel to read the data from a buffer and the thread can go for other work during that period and continue again from the previous point where it has left. In the meantime, the reading operation is complete which increases the overall efficiency.
Buffer oriented approach: Java NIO’s buffer oriented approach allows us to move forth and back in the buffer as we need. The data is read into a buffer and cached there. Whenever the data is required, it is further processed from the buffer.
The main working of the Java NIO package is based on some core components. They are:

Buffers: Buffers are available in this package for the primitive data types. Java NIO is a buffer oriented package. It means that the data can be written/read to/from a buffer which further processed using a channel. Here, the buffers act as a container for the data as it holds the primitive data types and provides an overview of the other NIO packages. These buffers can be filled, drained, flipped, rewind, etc.
Channels: Channels are the new primitive I/O abstraction. A channel is a bit like stream used for communicating with the outside world. From the channel, we can read the data into a buffer or write from a buffer. Java NIO performs the non-blocking IO operations and the channels are available for these IO operations. The connection to different entities is represented by various channels which are capable of performing non-blocking I/O operation. The channels work as a medium or a gateway. The following image illustrates the channel and buffer interaction:

![](https://media.geeksforgeeks.org/wp-content/uploads/20200528205425/channel-2.png)

Selectors: Selectors are available for non-blocking I/O operations. A selector is an object which monitors multiple channels for the events. As Java NIO performs the non-blocking IO operations, selectors and the selection keys with selectable channels defines the multiplexed IO operations. So, in simple words, we can say that the selectors are used to select the channels which are ready for the I/O operation. The following image illustrates the selector handling the channels:

![](https://media.geeksforgeeks.org/wp-content/uploads/20200528205706/selector-2.png)

Package	Purpose
java.nio package	           It provides the overview of the other NIO packages.Different types of buffers are encapsulated by this NIO system, which are used throughout the NIO API’s.
java.nio.channels package	   It supports channels and selectors, which represent connections to entities which are essentially open the I/O connections and selects the channel ready for I/O.
java.nio.channels.spi package	   It supports the service provider classes for java.io.channel package.
java.nio.file package	           It provides the support for files.
java.nio.file.spi package	   It supports the service provider classes for java.io.file package.
java.nio.file.attribute package	   It provides the support for file attributes.
java.nio.charset package	   It defines character sets and providing encoding and decoding operations for new algorithms.
java.nio.charset.spi package	   It supports the service provider classes for java.nio.charset package.

Why Java.nio.File, when Java.io.   File is already present? It is a very common question that why we will move to Java.nio.File when Java.io.File is already present. There were a few things which were missing in the old Java.io.File and that led to the usage of the new Java.nio.File. The following are some of the things which were missing in the old package and the reasons why the new package is used:

- The old module provides limited support for the symbolic links.
- The old module provides limited support for file attributes and performance issues.
- The old module does not work consistently across all the platforms.
- The old module is missing with the basic operations like file copy, move, etc.