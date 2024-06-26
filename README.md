# Java_Memory_Management_System
This project implements a Memory Management System (MMS) as part of Homework 10 in the Intro to CS course at the Efi Arazi School of CS. The system manages memory blocks using linked lists and provides functionalities like allocating, freeing, and defragmenting memory.

## Classes

### Node Class

- Represents a node in a list of memory blocks.
- Points to a memory block and to the next node in the list.

### ListIterator Class

- Represents an iterator for a linked list of memory blocks.
- Iterates through the list and retrieves memory blocks.

### MemorySpace Class

- Manages a memory space (heap) using malloc, free, and defrag methods.
- Tracks allocated and free memory blocks using linked lists.

### MemBlock Class

- Represents a memory block with a base address and length.

### List Class

- Manages a list of nodes, each containing a memory block.
- Supports adding, removing, and iterating through nodes.

### MMSTest Class

- Tests the functionality of the MemorySpace class with malloc and free operations.
- Verifies correct allocation and deallocation of memory blocks.

### ListTest Class

- Tests the methods of the List class for adding, removing, and accessing nodes.

## Usage

### Setup:

1. Ensure Java Development Kit (JDK) is installed on your system.
2. Compile all `.java` files in the project directory using `javac *.java`.
3. The code of `StdIn.java` is available [here](https://introcs.cs.princeton.edu/java/stdlib/StdDraw.java), place it in the same directory as the Java files.


### Testing:

   - Run java ListTest to execute basic unit tests on list operations.
   - Run java MMSTest to execute unit tests for the Memory Management System.
   - Modify ListTest and MMSTest to expand or customize tests for your requirements.
