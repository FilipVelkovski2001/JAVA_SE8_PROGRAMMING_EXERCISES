# Java JDBC 

Introduction
JDBC or Java Database Connectivity is a specification from Sun microsystems that provides a standard abstraction(that is API or Protocol) for java applications to communicate with various databases. It provides the language with java database connectivity standard. It is used to write programs required to access databases. JDBC along with the database driver is capable of accessing databases and spreadsheets. The enterprise data stored in a relational database(RDB) can be accessed with the help of JDBC APIs.

Definition of JDBC(Java Database Connectivity)
JDBC is an API(Application programming interface) which is used in java programming to interact with databases.
The classes and interfaces of JDBC allows application to send request made by users to the specified database.

Purpose of JDBC
Enterprise applications that are created using the JAVA EE technology need to interact with databases to store application-specific information. So, interacting with a database requires efficient database connectivity which can be achieved by using the ODBC(Open database connectivity) driver. This driver is used with JDBC to interact or communicate with various kinds of databases such as Oracle, MS Access, Mysql and SQL server database.

Components of JDBC
There are generally four main components of JDBC through which it can interact with a database. They are as mentioned below:

JDBC API: It provides various methods and interfaces for easy communication with the database.It provides two packages as follows which contains the java SE and java EE platforms to exhibit WORA(write once run everywhere) capabilities.
1. java.sql.*;
2. javax.sql.*;
It also provides a standard to connect a database to a client application.

JDBC Driver manager: It loads database-specific driver in an application to establish a connection with a database. It is used to make a database-specific call to the database to process the user request.
JDBC Test suite: It is used to test the operation(such as insertion, deletion, updation) being performed by JDBC Drivers.
JDBC-ODBC Bridge Drivers: It connects database drivers to the database.This bridge translates JDBC method call to the ODBC function call.It makes the use of
sun.jdbc.odbc
package that includes native library to access ODBC characteristics.

Architecture of JDBC

![](https://media.geeksforgeeks.org/wp-content/uploads/20200229213833/Architecture-of-JDBC2.jpg)

Description:



Application: It is a java applet or a servlet which communicates with a data source.
The JDBC API: The JDBC API allows Java programs to execute SQL statements and retrieve results. Some of the important classes and interfaces defined in JDBC API are as follows:
DriverManager
Driver
Connection
Statement
PreparedStatement
CallableStatement
ResultSet
SQL data
DriverManager: It plays an important role in the JDBC architecture.It uses some database-specific drivers to effectively connect enterprise applications to databases.
JDBC drivers: To communicate with a data source through JDBC, you need a JDBC driver that intelligently communicates with the respective data source.
Types of JDBC Architecture(2-tier and 3-tier)
The JDBC architecture consists of two-tier and three-tier processing models to access a database. They are as described below:

Two-tier model: A java application communicates directly to the data source. The JDBC driver enables the communication between the application and the data source. When a user sends a query to the data source, the answers for those queries are sent back to the user in the form of results.
The data source can be located on a different machine on a network to which a user is connected. This is known as a client/server configuration, where the user’s machine acts as a client and the machine having the data source running acts as the server.
Three-tier model: In this, the user’s queries are sent to middle-tier services, from which the commands are again sent to the data source. The results are sent back to the middle tier, and from there to the user.
This type of model is found very useful by management information system directors.
Working of JDBC
Java application that needs to communicate with the database has to be programmed using JDBC API. JDBC Driver supporting data sources such as Oracle and SQL server has to be added in java application for JDBC support which can be done dynamically at run time. This JDBC driver intelligently communicates the respective data source.

Creating a simple JDBC application:

```

package com.vinayak.jdbc;
import java.sql.*;
public class JDBCDemo {
    public static void main(
        String args[]) throws SQLException,
                              ClassNotFoundException
    {
        String driverClassName
            = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:XE";
        String username = "scott";
        String password = "tiger";
        String query
            = "insert into students values(109, 'bhatt')";
  
        // Load driver class
        Class.forName(driverClassName);
  
        // Obtain a connection
        Connection con = DriverManager.getConnection(
            url, username, password);
  
        // Obtain a statement
        Statement st = con.createStatement();
  
        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println(
            "number of rows affected by this query= " + count);
  
        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
} // class

```

The above example demonstrates the basic steps to access a database using JDBC. The application uses the JDBC-ODBC bridge driver to connect to the database. You must import java.sql package to provide basic SQL functionality and use the classes of the package.

## Establishing connection to JDBC

Description:



Application: It is a java applet or a servlet which communicates with a data source.
The JDBC API: The JDBC API allows Java programs to execute SQL statements and retrieve results. Some of the important classes and interfaces defined in JDBC API are as follows:
DriverManager
Driver
Connection
Statement
PreparedStatement
CallableStatement
ResultSet
SQL data
DriverManager: It plays an important role in the JDBC architecture.It uses some database-specific drivers to effectively connect enterprise applications to databases.
JDBC drivers: To communicate with a data source through JDBC, you need a JDBC driver that intelligently communicates with the respective data source.
Types of JDBC Architecture(2-tier and 3-tier)
The JDBC architecture consists of two-tier and three-tier processing models to access a database. They are as described below:

Two-tier model: A java application communicates directly to the data source. The JDBC driver enables the communication between the application and the data source. When a user sends a query to the data source, the answers for those queries are sent back to the user in the form of results.
The data source can be located on a different machine on a network to which a user is connected. This is known as a client/server configuration, where the user’s machine acts as a client and the machine having the data source running acts as the server.
Three-tier model: In this, the user’s queries are sent to middle-tier services, from which the commands are again sent to the data source. The results are sent back to the middle tier, and from there to the user.
This type of model is found very useful by management information system directors.
Working of JDBC
Java application that needs to communicate with the database has to be programmed using JDBC API. JDBC Driver supporting data sources such as Oracle and SQL server has to be added in java application for JDBC support which can be done dynamically at run time. This JDBC driver intelligently communicates the respective data source.
Creating a simple JDBC application

package com.vinayak.jdbc;
import java.sql.*;
public class JDBCDemo {
    public static void main(
        String args[]) throws SQLException,
                              ClassNotFoundException
    {
        String driverClassName
            = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:XE";
        String username = "scott";
        String password = "tiger";
        String query
            = "insert into students values(109, 'bhatt')";
  
        // Load driver class
        Class.forName(driverClassName);
  
        // Obtain a connection
        Connection con = DriverManager.getConnection(
            url, username, password);
  
        // Obtain a statement
        Statement st = con.createStatement();
  
        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println(
            "number of rows affected by this query= " + count);
  
        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
} // class

The above example demonstrates the basic steps to access a database using JDBC. The application uses the JDBC-ODBC bridge driver to connect to the database. You must import java.sql package to provide basic SQL functionality and use the classes of the package.

## More about JDBC

Before establishing a connection between the front end i.e your Java Program and the back end i.e the database we should learn what precisely a JDBC is and why it came to existence. Now let us discuss what exactly JDBC stands for and will ease out with the help of real-life illustration to get it working.  

What is JDBC? 

JDBC is an acronym for Java Database Connectivity. It’s an advancement for ODBC ( Open Database Connectivity ). JDBC is a standard API specification developed in order to move data from frontend to backend. This API consists of classes and interfaces written in Java. It basically acts as an interface (not the one we use in Java) or channel between your Java program and databases i.e it establishes a link between the two so that a programmer could send data from Java code and store it in the database for future use.

Illustration: Working of JDBC co-relating with real-time

![](https://media.geeksforgeeks.org/wp-content/uploads/20210729165249/JavaApp.png)

Why JDBC Came into Existence? 

As previously told JDBC is an advancement for ODBC, ODBC being platform-dependent had a lot of drawbacks. ODBC API was written in C, C++, Python, Core Java and as we know above languages (except Java and some part of Python )are platform dependent. Therefore to remove dependence, JDBC was developed by a database vendor which consisted of classes and interfaces written in Java. 

Steps For Connectivity Between Java Program and Database

Import the database
Load the drivers using the forName() method 
Register the drivers using DriverManager 
Establish a connection using the Connection class object
Create a statement
Execute the query
CLose the connections
Let us discuss these steps in brief before implementing by writing suitable code to illustrate connectivity steps for JDBC/

Step 1: Import the database

Step 2: Loading the drivers 

In order to begin with, you first need to load the driver or register it before using it in the program. Registration is to be done once in your program. You can register a driver in one of two ways mentioned below as follows:

2-A Class.forName()



Here we load the driver’s class file into memory at the runtime. No need of using new or create objects. The following example uses Class.forName() to load the Oracle driver as shown below as follows:

Class.forName(“oracle.jdbc.driver.OracleDriver”);
2-B DriverManager.registerDriver()

DriverManager is a Java inbuilt class with a static member register. Here we call the constructor of the driver class at compile time. The following example uses DriverManager.registerDriver()to register the Oracle driver as shown below: 

 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver())
 Step 4: Establish a connection using the Connection class object

After loading the driver, establish connections via as shown below as follows: 

Connection con = DriverManager.getConnection(url,user,password)
user: Username from which your SQL command prompt can be accessed.
password: password from which the SQL command prompt can be accessed.
con: It is a reference to the Connection interface.
Url : Uniform Resource Locator which is created as shown below:
String url = “ jdbc:oracle:thin:@localhost:1521:xe”
Where oracle is the database used, thin is the driver used, @localhost is the IP Address where a database is stored, 1521 is the port number and xe is the service provider. All 3 parameters above are of String type and are to be declared by the programmer before calling the function. Use of this can be referred from the final code.

Step 5: Create a statement 

Once a connection is established you can interact with the database. The JDBCStatement, CallableStatement, and PreparedStatement interfaces define the methods that enable you to send SQL commands and receive data from your database. 
Use of JDBC Statement is as follows: 

Statement st = con.createStatement();
Note: Here, con is a reference to Connection interface used in previous step .

Step 6: Execute the query 

Now comes the most important part i.e executing the query. The query here is an SQL Query. Now we know we can have multiple types of queries. Some of them are as follows: 



The query for updating/inserting table in a database.
The query for retrieving data.
The executeQuery() method of the Statement interface is used to execute queries of retrieving values from the database. This method returns the object of ResultSet that can be used to get all the records of a table. 
The executeUpdate(sql query) method of the Statement interface is used to execute queries of updating/inserting.

Pseodo Code:

```

int m = st.executeUpdate(sql);
if (m==1)
    System.out.println("inserted successfully : "+sql);
else
    System.out.println("insertion failed");
Here sql is SQL query of the type String

Step 7: Closing the connections 

So finally we have sent the data to the specified location and now we are on the verge of completing of our task. By closing the connection, objects of Statement and ResultSet will be closed automatically. The close() method of the Connection interface is used to close the connection. It is as shown below as follows:

 con.close();
Example:

// Java Program to Establish Connection in JDBC
 
// Importing database
importjava.sql.*;
// Importing required classes
importjava.util.*;
 
// Main class
class Main {
 
    // Main driver method
    public static void main(String a[])
    {
 
        // Creating the connection using Oracle DB
        // Note: url syntax is standard, so do grasp
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
 
        // Usernamer and password to access DB
        // Custom initialization
        String user = "system";
        String pass = "12345";
 
        // Entering the data
        Scanner k = new Scanner(System.in);
 
        System.out.println("enter name");
        String name = k.next();
 
        System.out.println("enter roll no");
        int roll = k.nextInt();
 
        System.out.println("enter class");
        String cls = k.next();
 
        // Inserting data using SQL query
        String sql = "insert into student1 values('" + name
                     + "'," + roll + ",'" + cls + "')";
 
        // Connection class object
        Connection con = null;
 
        // Try block to check for exceptions
        try {
 
            // Registering drivers
            DriverManager.registerDriver(
                new oracle.jdbc.OracleDriver());
 
            // Reference to connection interface
            con = DriverManager.getConnection(url, user,
                                              pass);
 
            // Creating a statement
            Statement st = con.createStatement();
 
            // Executing query
            int m = st.executeUpdate(sql);
            if (m == 1)
                System.out.println(
                    "inserted successfully : " + sql);
            else
                System.out.println("insertion failed");
 
            // Closing the connections
            con.close();
        }
 
        // Catch block to handle exceptions
        catch (Exception ex) {
            // Display message when exceptions occurs
            System.err.println(ex);
        }
    }
}

```

Output: 

https://media.geeksforgeeks.org/wp-content/uploads/20211010155321/Screenshot20211010at35239PM.png



