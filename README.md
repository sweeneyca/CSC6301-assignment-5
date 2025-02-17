# CSC6301-assignment-5
CSC6301 - Software Design &amp; Documentation - Week 5 Coding Assignment

# Instructions for Assignment
Plan and execute a maintenance task to your last project (Project #4) adapting to be now a Stack and not a LinkedList
Implement a program that reads a list of Integer numbers from the scan input and saves them into a Stack sorted from the smallest to the largest:
Please make sure this is a maintenance task and you are not re-writing the program from scratch!
Use Collections Framework
Follow code guidelines and document your code accordingly;

# Description
This program reads a list of integer numbers from standard input, stores them in a Stack, sorts them in ascending order, and prints the sorted stack.
This program makes use of Java's Collections Framework to avoid reinventing commonly used data structures and algorithms:
{@code Stack<Integer>} for dynamic storage instead of a LinkedList
{@code Collections.sort()} for efficient sorting
{@code Scanner} for input handling

# Usage
The program can be run from the command line by compiling it first:
javac SortedStack.java
Then run using this command:
java SortedStack

To generate JavaDocs, use the command:
javadoc -d doc SortedStack.java
