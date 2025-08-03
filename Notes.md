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