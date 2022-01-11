# Java IO 

Java brings various Streams with its I/O package that helps the user to perform all the input-output operations. These streams support all the types of objects, data-types, characters, files etc to fully execute the I/O operations.

![](https://media.geeksforgeeks.org/wp-content/uploads/20191126125125/Java-Input-Output-Stream.jpg)

Before exploring various input and output streams lets look at 3 standard or default streams that Java has to provide which are also most common in use:

![](https://media.geeksforgeeks.org/wp-content/uploads/20191127113736/Java-Basic-input-output1.png)

System.in: This is the standard input stream that is used to read characters from the keyboard or any other standard input device.
System.out: This is the standard output stream that is used to produce the result of a program on an output device like the computer screen.
Here is a list of the various print functions that we use to output statements:



- print(): This method in Java is used to display a text on the console. This text is passed as the parameter to this method in the form of String. This method prints the text on the console and the cursor remains at the end of the text at the console. The next printing takes place from just here.
Syntax:
System.out.print(parameter);

- println(): This method in Java is also used to display a text on the console. It prints the text on the console and the cursor moves to the start of the next line at the console. The next printing takes place from the next line.
Syntax:
System.out.println(parameter);

- printf(): This is the easiest of all methods as this is similar to printf in C. Note that System.out.print() and System.out.println() take a single argument, but printf() may take multiple arguments. This is used to format the output in Java.

- System.err: This is the standard error stream that is used to output all the error data that a program might throw, on a computer screen or any standard output device.
This stream also uses all the 3 above-mentioned functions to output the error data:

print()
println()
printf()

Types of Streams:

Depending on the type of operations, streams can be divided into two primary classes:

- Input Stream: These streams are used to read data that must be taken as an input from a source array or file or any peripheral device. For eg., FileInputStream, BufferedInputStream, ByteArrayInputStream etc.

![](https://media.geeksforgeeks.org/wp-content/uploads/20191126132719/Java-Input-Stream.png)

- Output Stream: These streams are used to write data as outputs into an array or file or any output peripheral device. For eg., FileOutputStream, BufferedOutputStream, ByteArrayOutputStream etc.

![](https://media.geeksforgeeks.org/wp-content/uploads/20191126133237/Java-Output-Stream.png)

- Depending on the types of file, Streams can be divided into two primary classes which can be further divided into other classes as can be seen through the diagram below followed by the explanations.

![](https://media.geeksforgeeks.org/wp-content/uploads/20191127121553/Java-stream-classification-filetype2.png)

1. ByteStream: This is used to process data byte by byte (8 bits). Though it has many classes, the FileInputStream and the FileOutputStream are the most popular ones. The FileInputStream is used to read from the source and FileOutputStream is used to write to the destination. Here is the list of various ByteStream Classes:

```

Stream class	         Description
BufferedInputStream	It is used for Buffered Input Stream.
DataInputStream	        It contains method for reading java standard datatypes.
FileInputStream	        This is used to reads from a file
InputStream	        This is an abstract class that describes stream input.
PrintStream	        This contains the most used print() and println() method
BufferedOutputStream	This is used for Buffered Output Stream.
DataOutputStream	This contains method for writing java standard data types.
FileOutputStream	This is used to write to a file.
OutputStream	        This is an abstract class that describe stream output.

```

2. CharacterStream: In Java, characters are stored using Unicode conventions (Refer this for details). Character stream automatically allows us to read/write data character by character. Though it has many classes, the FileReader and the FileWriter are the most popular ones. FileReader and FileWriter are character streams used to read from the source and write to the destination respectively. Here is the list of various CharacterStream Classes:

```

Stream class	    Description
BufferedReader	    It is used to handle buffered input stream.
FileReader	    This is an input stream that reads from file.
InputStreamReader   This input stream is used to translate byte to character.
OutputStreamReader  This output stream is used to translate character to byte.
Reader	            This is an abstract class that define character stream input.
PrintWriter	    This contains the most used print() and println() method
Writer	            This is an abstract class that define character stream output.
BufferedWriter	    This is used to handle buffered output stream.
FileWriter	    This is used to output stream that writes to file.

```

