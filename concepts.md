# OOP Concepts and Terminology

## Programming

### Paradigms

* Procedural Programming: sequential with procedures/functions. E.g. C, Pascal, PHP, Python
* Object-oriented Programming: operate on objects. E.g. Java, C++, SmallTalk, C#, PHP, Python, ...
* Functional Programming: evaluate math functions, E.g. ML, Haskell, ...

Note the above is not the only classification of programming paradigms, and most languages support multiple paradigms (but may be designed for one paradigm)

### Execution with C

1. file.c is the source code
2. Compile the source code to produce an executable, file.exe or file (with no extension). 
3. Compiler produces executable for particular operating systems and hardware architecture, e.g. Windows on x86, Linux on x86, Windows on ARM
4. Executable is not compatable with other OS/architectures, e.g. file.exe will not run on Linux (need to re-compile)

### Execution with Java

1. file.java is the source code
2. Compile the source code to produce byte code, file.class
3. Compiler produces byte code that is standard
4. Byte code is interpreted by a Java Virtual Machine. The JVM must be installed on system and is specified to OS/architecture.
5. JVM 'converts' byte code to specific instructions for the OS/architecture
6. Byte code IS compatable with other OS/architectures, e.g. file.class will run on Windows, Linux, ARM, ... (so long as they have a JVM)

## Java Basics

* Programs are made of **objects**
* **Class** defines a template for a set of objects
* Filename and classname must be identical. Can only have one public class in file, but can include other (non-public) classes.
* **Instance variables** are defined for the class
* **Constructor** methods used to construct an object. Can have multiple.
* **Overloading** of methods requires each method with same name to have unique set of parameters (number, order, type)
* **Getter** and **setter** methods used to get/set values of instance variables
* **Private** access: only in class; **Public** access: any class; **Protected** access: within package
* **Static variables** are shared across objects of same class
* **Static methods** do not operate on objects (only primitive types and static variables)

## Composition

* One class has an instance variable that is of another class/type
* A class is **composed** of others, i.e. **has-a** relationship
```
Example:
 - class Address includes street, city, postCode, country instance variables
 - class Person includes name, birthDate, address instance variables
 - address instance variable is of class Address
 - a Person has-a Address
 ```

## Inheritance

* One class can **inherit** members (instance variables, methods) from another class, i.e. **is-a** relationship
```
Example:
 - class Employee is-a Person
 - Employee includes salary and startDate instance variables
 - Employee inherits name, birthDate, address instance variables, as well as methods, from Person class
```
* A **subclass** inherits from a **superclass** using the **extend** keyword
* **super** refers to the superclass
* Methods from superclass can be **overridden** in the subclass with **@Override** keyword
* **Object** is the **cosmic superclass**
* **toString()** method prints the object as a string; useful for debugging

## Abstract Classess and Methods

* An **abstract class** is a class that cannot be instantiated (i.e. cannot create objects of this class), but other classes can inherit from
```
Example:
 - set Person class as an abstract class
 - Employee inherits from Person
 - can create an Employee object, but cannot create a Person object
 ```
 * Set to abstract using the **abstract** keyword after the access modifier
 * An **abstract method** defines the method name, parameters and return type, but contains no code
 * Any class containing an abstract methods MUST be an abstract class
 * But an abstract class does not necessarily have to include an abstract method
 
 ## Polymorphism
 
 * **Polymorphism** is when an object variable can refer to multiple different types
 * Java selects the method to call based on the type of variable when the code is running (**dynamic binding**)
 * Alternatively, if Java knows the method during compilation (e.g. private, static, final, constructor method) then called **static binding**
 
 ## GUI
 
 * JFrame often has a layout, such as Grid, Flow or Border
 * Frames can include JPanels, and panels can be placed inside each other, each panel with own layout
 * GUI elements are added to panels (or direct to frame)
 * Elements include: JTextField, JLabel, JButton, JCheckBox, JRadioButton, JTextArea
 * When buttons are pressed, events occur and corresponding actions are performed. If a button implements the ActionListener interface, then it must have the actionPerformed method
 
