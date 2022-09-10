 // Basic Introduction to Java


// How to install packages/import libraries
//A package in Java is used to group related classes. It is a way to put classes and interfaces on a logical group. 
// Example: import package.name.Class;   // Import a single class
// Example: import package.name.*;       // Import all classes in a package

// How to declare a class
// A class is a blueprint from which individual objects are created.
// Example: public class MyClass {

// How to declare a method
// A method is a block of code which only runs when it is called.
// Example: public static void myMethod() 

// How to declare a variable
// A variable is a container for a value, which can be of different types.










// Program to convert celcius to fahrenheit

import java.util.Scanner;
public class celcius
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
int c = sc.nextInt();
int f = (c*9/5)+32;

System.out.println("The temperature in fahrenheit is "+f);
}
}




// Language: java