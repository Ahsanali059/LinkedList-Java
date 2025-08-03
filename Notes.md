===================
What is Linked list
===================

-> Linkedlist is Linear Data Structure where element Called Nodes.
-> Nodes are connected using pointers.

Each node contains 2 things 
1) The actual Data 
2) A reference (pointer) to the next node in the sequence

Unlike arrays,Linkedlist dont rely on contiguous blocks of memory.They are dynamic so 
you can grow and shrink them at runtime efficiently at runtime.

=========================================
How Linkedlist is different from arrays ? 
=========================================
1) Memory allocation:
   Arrays: Contiguous(fixed at creation)
   Linkedlist: Non-Contiguous (allocated as needed)

2) Size Flexibility	:
   Arrays: Fixed Size (unless resized)
   Linkedlist: Dynamic Size

3) Insertion/Deletion: 
   Arrays: Costly required shifting element
   Linkedlist: Efficient just update the pointer

4) Access time: 
   Arrays: Fast random Access Via Index.
   Linkedlist: Sequential access only (node-by-node)

========================
🧬 Types of Linked Lists
========================
1) Singly Linked Lists
   -> Each Node points only to the next node.
   -> Simple and memory Efficient
   -> Used for stacks,Sequential traversal task
2) Doubly Linked Lists
   -> Each node points to both next and previous nodes
   -> Allows traversal in both directions
   -> Requires more memory (extra pointer)

3) Circular Linked List 
   -> The last node connects back to the first node
   -> Can be singly or doubly linked
   -> Useful in applications like task scheduling, music playlists


========================================
Linkedlist Predined Class Implementation
========================================

-> LinkedList is Implemented class of list interface which is present in java.util package.
-> Syntax : public class LinkedList extends
   AbstractSequentialList implements List, Deque,
   Cloneable, Serializable { - }
-> The Underline data structure of LinkedList is Doubly LinkedList or Circular LinkedList.
-> LinkedList was introduced in JDK 1.2 version.


========================
Properties of Linkedlist
========================

-> Linkedlist is index based data structure which means that first element will be inserted 
at 0 index position.

-> LinkedList was store different data types o heterogenous elements.
-> We can store duplicate element in the Linked list
-> We can store any number of null values. 
->LinkedList follows the insertion order which means the sequence in which we are inserting
the elements, in the same sequence we can retrieve the elements.
->. LinkedList does not follow the sorting order
    (above properties are same as List interface)

-> LinkedList is non-synchronized collection because LinkedList does not contain any synchronized method
-> LinkedList allows more than one thread at one time
-> LinkedList allows parallel execution
-> LinkedList reduces the execution time which in turn makes the application fast
-> LinkedList is not threadsafe
-> LinkedList does not gurantee for data consistency

=====================================
When we should not use LinkedList ?
=====================================

=> LinkedList is worst in case of retrieval or
searching operations (as LinkedList does not inherit
RandomAccess interface)

==================================================
What is difference between ArrayList &LinkedList ?
==================================================

1. ArrayList underline data structure is dynamic array or resizable array
   LinkedList underline data structure is double linked list or circular linked list

2. ArrayList stores the elements in contigeous memory locations
   LinkedList does not store the elements in contigeous memory locations

   ArrayList acts as List
   LinkedList can acts as List or Deque

4. ArrayList is good in case of retrieval operations 
   LinkedList is good in case of insertion and deletion operations

5. ArrayList is worst in case of insertion or deletion operations
   LinkedList is worst in case of retrieval operations