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

## Inheritance

* One class can **inherit** members (instance variables, methods) from another class, i.e. **is-a** relationship
* A **subclass** inherits from a **superclass** using the **extend** keyword
* **super** refers to the superclass
* Methods from superclass can be **overridden** in the subclass with **@Override** keyword
* **Object** is the **cosmic superclass**
* **toString()** method prints the object as a string; useful for debugging
