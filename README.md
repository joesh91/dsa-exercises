# 📚 Java Data Structures & Algorithms From Scratch

A structured collection of **Data Structures and Algorithms implemented manually using Java**.

This repository reflects a disciplined, hands-on journey to mastering core computer science fundamentals through **clean code, practical logic building, and real understanding over memorization**.

---

# 🚀 Why This Repository?

This project is focused on developing strong problem-solving ability and deep technical foundations by building common data structures and algorithms from scratch instead of relying on built-in libraries.

### Goals of this repository:

- Strengthen core CS fundamentals  
- Improve coding logic and problem-solving  
- Prepare for technical interviews  
- Practice clean and maintainable Java code  
- Understand how data structures work internally  
- Build long-term software engineering skills  

---

# 🛠 Tech Stack

- **Language:** Java  
- **IDE:** IntelliJ IDEA / Eclipse  
- **Concepts:** OOP, DSA, Recursion, Traversals, Searching, Sorting  

---

# 🚀 Current Implementations

# 🔗 Linked Lists

## Singly Linked List

Supports:

- Insert at head (`addToHead`)
- Insert at tail (`addToTail`)
- Insert after node (`addAfter`)
- Traversal (`traversalNodes`)
- Search (`isFound`)
- Delete (`delete`)
- Node count (`getNodesCount`)

---

## Doubly Linked List

Supports:

- Insert at head (`addToHead`)
- Insert at tail (`addToTail`)
- Insert after node (`addAfter`)
- Forward traversal (`traversalHeadToTail`)
- Reverse traversal (`traversalTailToHead`)
- Search (`isFound`)
- Delete (`delete`)
- Node count (`getNodesCount`)
- Get head data (`getHeadData`)
- Get tail data (`getTailData`)

---

# 🌳 Trees

## Binary Search Tree (BST)

Supports:

- Insert (`insert`)
- Search (`search`)
- Find minimum (`findMin`)
- Find maximum (`findMax`)
- Pre-order traversal (`preOrder`)
- In-order traversal (`inOrder`)
- Post-order traversal (`postOrder`)
- Breadth-first traversal (`breadthFirstTraversal`)

---

# 🧱 Stacks

## Array Stack

Supports:

- Push (`push`)
- Pop (`pop`)
- Peek (`peek`)
- isEmpty()
- isFull()
- Item count (`getItemsCount`)

## Linked List Stack

Supports:

- Push (`push`)
- Pop (`pop`)
- Peek (`peek`)
- isEmpty()

---

# 📥 Queues

## Circular Array Queue

Supports:

- Enqueue (`enqueue`)
- Dequeue (`dequeue`)
- Peek (`peek`)
- isEmpty()
- isFull()
- Count (`getCount`)

## Linked List Queue

Supports:

- Enqueue (`enqueue`)
- Dequeue (`dequeue`)
- Peek (`peek`)
- Rear Data (`getRearData`)

---

# 🕸 Graphs

## Directed Graph (Adjacency Matrix)

Supports:

- Add Vertex (`addVertex`)
- Add Edge (`addEdge`)
- Depth First Traversal (`depthFirstTraversal`)

---

# 🔍 Searching Algorithms

## Implemented:

- Linear Search
- Binary Search (Iterative)
- Binary Search (Recursive)

---

# 🔃 Sorting Algorithms

## Implemented:

- Bubble Sort
- Selection Sort
- Insertion Sort

---

# 📂 Project Structure

```text
dsa-exercises/
│
├── src/com/shamal/dsa/
│
├── linkedlist/
│   ├── singly/
│   └── doubly/
│
├── stack/
│   ├── array/
│   └── linkedlist/
│
├── queue/
│   ├── circularqueue/
│   └── linkedlist/
│
├── tree/
│   └── binarysearchtree/
│
├── graph/
│   └── directedgraph/
│
├── searching/
│   ├── linear/
│   ├── binary/
│   └── binaryrecursion/
│
├── sorting/
│   ├── bubblesort/
│   ├── selectionsort/
│   └── insertionsort/
│
└── README.md