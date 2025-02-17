# CSC6301-assignment-5
CSC6301 - Software Design &amp; Documentation - Week 5 Coding Assignment <br />
Module 05: Assignment 01 - Project 05 - Planning and Executing a Maintenance Task

# Instructions for Assignment
Plan and execute a maintenance task to your last project (Project #4) adapting to be now a Stack and not a LinkedList
Implement a program that reads a list of Integer numbers from the scan input and saves them into a Stack sorted from the smallest to the largest:
Please make sure this is a maintenance task and you are not re-writing the program from scratch!
Use Collections Framework.
Follow code guidelines and document your code accordingly.

# Description
This program reads a list of integer numbers from standard input, stores them in a Stack, sorts them in ascending order, and prints the sorted stack.
This program makes use of Java's Collections Framework to avoid reinventing commonly used data structures and algorithms: <br />
```Stack<Integer>``` for dynamic storage instead of a LinkedList. ```Collections.sort()``` for efficient sorting. ```Scanner``` for input handling.

# Features
- Reads integers from standard input and stores in a Stack.
- Sorts the list in ascending order.
- Prints the sorted list to the console.

# How to Run
The program can be run from the command line by compiling it first: <br />
```
javac SortedStack.java
```
<br />

Then run using this command: <br />
```
java SortedStack
```
<br />

To generate JavaDocs, use the command: <br />
```
javadoc -d doc SortedStack.java
```
<br />

# Dependencies
Java 8 or later

# Contributing
This is an individual assignment.

# License
This project is licensed under the Merrimack License.
