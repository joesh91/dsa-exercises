# 📚 DSA Exercises (Java)

A structured collection of **Data Structures and Algorithms implementations built from scratch using Java**.

This repository reflects a disciplined, step-by-step approach to mastering core computer science fundamentals through **clean, readable, and practical implementations**.

---

# 🚀 Current Implementations

## 🔗 Linked Lists

### Singly Linked List

Supports:

* Insert at head (`addToHead`)
* Insert at tail (`addToTail`)
* Insert after a node (`addAfter`)
* Traversal (`traversalNodes`)
* Search (`isFound`)
* Deletion (`delete`)
* Node counting (`getNodesCount`)

---

### Doubly Linked List

Supports:

* Insert at head (`addToHead`)
* Insert at tail (`addToTail`)
* Insert after a node (`addAfter`)
* Forward traversal (`traversalHeadToTail`)
* Reverse traversal (`traversalTailToHead`)
* Search (`isFound`)
* Deletion (`delete`)
* Node counting (`getNodesCount`)
* Get head node data (`getHeadData`)
* Get tail node data (`getTailData`)

---

## 🌳 Trees

### Binary Search Tree (BST)

Supports:

* Insert (`insert`)
* Search (`search`)
* Find minimum value (`findMin`)
* Find maximum value (`findMax`)
* Pre-order traversal (`preOrder`)
* In-order traversal (`inOrder`)
* Post-order traversal (`postOrder`)
* Breadth-first traversal (`breadthFirstTraversal`)

---

# 📂 Project Structure

```text
dsa-exercises/
│
├── src/
│   └── com/
│       └── shamal/
│           └── dsa/
│               │
│               ├── linkedlist/
│               │   ├── singly/
│               │   │   ├── Node.java
│               │   │   ├── SinglyLinkedList.java
│               │   │   └── SinglyLinkedListTest.java
│               │   │
│               │   └── doubly/
│               │       ├── Node.java
│               │       ├── DoublyLinkedList.java
│               │       └── DoublyLinkedListTest.java
│               │
│               └── tree/
│                   └── binarysearchtree/
│                       ├── Node.java
│                       ├── BinarySearchTree.java
│                       └── BinarySearchTreeTest.java
│
├── .gitignore
└── README.md
```

---

# 🧠 Concepts Covered

* Linked Data Structures
* Tree Data Structures
* Node-Based Design
* Pointer / Reference Manipulation
* Traversal Algorithms
* Recursive Tree Traversals
* Breadth-First Search (BFS)
* CRUD Operations on Data Structures

---

# ▶️ Sample Outputs

## Doubly Linked List

```text
C <-> B <-> A <-> Z <-> Y <-> 
Y <-> Z <-> A <-> B <-> C <-> 
DELETED ? true
FOUND ? true
NODES COUNT : 4
```

---

## Binary Search Tree

```text
MAX DATA : 1750
MIN DATA : 250

PRE ORDER TRAVERSAL
START 1000 -> 500 -> 250 -> 750 -> 1500 -> 1250 -> 1750 -> END

IN ORDER TRAVERSAL
START 250 -> 500 -> 750 -> 1000 -> 1250 -> 1500 -> 1750 -> END

POST ORDER TRAVERSAL
START 250 -> 750 -> 500 -> 1250 -> 1750 -> 1500 -> 1000 -> END

BREADTH FIRST TRAVERSAL
START 1000 -> 500 -> 1500 -> 250 -> 750 -> 1250 -> 1750 -> END
```

---

# 🎯 Goals

* Build strong Data Structures & Algorithms fundamentals
* Write clean and maintainable Java code
* Develop problem-solving skills
* Prepare for technical interviews
* Strengthen software engineering foundations

---

# 🚀 Future Work

Planned upcoming implementations:

* AVL Trees
* Heaps
* Hash Tables
* Graphs
* Sorting Algorithms
* Searching Algorithms
* Dynamic Programming Exercises

---

# 👤 Author

**Shamal**

Bachelor of Information Technology (BIT) Student
Passionate about Software Development, AI, and Core CS Fundamentals

---

# ⭐ Note

This repository is developed progressively with a focus on:

* Clarity
* Consistency
* Strong Fundamentals
* Real Understanding Over Memorization

Each implementation is written manually from scratch for learning and mastery purposes.
