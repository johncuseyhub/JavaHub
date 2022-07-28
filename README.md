
<p style="color:green; font-size:60px;">Java Hub </p>

<img src="https://github.com/johncuseyhub/GettingStarted/blob/main/HubBanner.png" alt="John Cusey Hub Logo" height="150" width="1000">

<img
src="https://github.com/johncuseyhub/GettingStarted/blob/main/LogoOrganizations/Java.PNG"
alt="Java 9"
height="100px"/>

<p style="color:green; font-size:60px;">Cheat Sheet</p>


# Abstract Methods and Classes
An abstract method can declared implementation or not. An abstract class cannot be instantiated.   

```Java
public abstract class Shape {

    public Shape() {}

    private String color;

   abstract public double area();

       public boolean isBlue(){
        return this.color.toUpperCase() == "BLUE";
    }

}
```
Square class extends the Shape class.

```Java
public class Square extends Shape {

     private double width = 0;
    private double length = 0;

    @Override
    public double area() {
        return this.width * this.length;
    }
}
```

# Collection Iterator

### Populate the collection

```Java
ArrayList<String> bandMembers = new ArrayList<String>();

bandMembers.add("Kurt Cobain");
bandMembers.add("Dave Grohl");  
bandMembers.add("Krist Novoselic");  
bandMembers.add("Pat Smear");
```

### Getting the iterator

```Java
Iterator<String> itr = bandMembers.iterator();
```
### Iterate the collection

```Java
while(itr.hasNext()){  
     System.out.println(itr.next());  
 }
```
### Remove element from collection
```Java
itr.remove();
```
# Default

Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.   

```java
interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
```

# Enumerations    

```Java
public enum CarSize{
  SMALL(1), MEDIUM(2), LARGE(3), EXTRALARGE(4);

  private int size;

  CarSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
```
### Methods

* <b>ordinal()</b> - returns the position of an enum constant
* <b>compareTo()</b> -  compares the enum constants based on their ordinal value.
* <b>toString()</b> - returns the string representation of the enum constants.
* <b>name()</b> - returns the defined name of an enum constant in string form. The returned value from the name() method is final.
* <b>valueOf()</b> - takes a string and returns an enum constant having the same string name.
* <b>values() </b> -  returns an array of enum type containing all the enum constants.

# Exception Handling

Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.     

Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program's instructions.   

# Generic

Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.    

Generics also provide compile-time type safety that allows programmers to catch invalid types at compile time.

Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements  
# Lambda
# Runnable Interface

### Why use Runnable
Although you have the ability to create new threads by using just the Thread class, which by itself implements the Runnable interface, the suggested and much more accepted approach is to use Runnable for all the logic that we want to provide for our threads. There are certain reasons for that:

* <b>Modularity:</b> When you run a thread and it finishes running, there is no way to restart it. This could lead to a lot of code duplication in case of multithreading, where you need a certain task to run a number of times. Fortunately, you can create a Runnable instance which can be reused in any number of threads.    


* <b>Ease of use:</b> Runnable only has one method, public void run(). It accepts no arguments and is as simple as possible. Thread has many methods that need to be taken into account making it very cumbersome to work with, and the extra overhead is always an issue.                 


* <b>Inheritance:</b> More often than not, you will have to use additional classes (through inheritance) to extend the functionality of your Runnable object. Java does not support multiple inheritance, so it is much more convenient to create a new class which just implements Runnable (and allows to extend another class) than creating a new class that extends Thread and prevents you from inheriting anything else.  

# References
## Abstract Methods and Classes
* [Java Abstraction - w3schools](https://www.w3schools.com/java/java_abstract.asp)

## Collection Iterator
* [A Guide to Iterator in Java - Baeldung](https://www.baeldung.com/java-iterator)

## Default   
* [Default Methods In Java 8 - GeeksforGeeks](https://www.geeksforgeeks.org/default-methods-java/)

## Enumerations
* [enum in Java - GeeksforGeeks](https://www.geeksforgeeks.org/enum-in-java/)
* [A Guide to Java Enums - Baeldung](https://www.baeldung.com/a-guide-to-java-enums)

## Exception Handling
* [Exceptions in Java](https://www.geeksforgeeks.org/exceptions-in-java)

## Generic
* [Java - Generics - tutorialspoint](https://www.tutorialspoint.com/java/java_generics.htm)

## Lambda   
* [Functional Interfaces in Java 8 - By Baeldung](https://www.baeldung.com/java-8-functional-interfaces)
* [Java Functional Interfaces - By Jenkov](https://jenkov.com/tutorials/java-functional-programming/functional-interfaces.html)

## Runnable Interface
* [Runnable interface in Java - GeeksforGeeks ](https://www.geeksforgeeks.org/runnable-interface-in-java/)
