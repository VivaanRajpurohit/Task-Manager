# Java Command-Line Task Manager

<p align="center">
  A compact object-oriented Java application for creating, prioritizing, completing, viewing, and deleting tasks.
</p>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-command--line-ED8B00?logo=openjdk&logoColor=white">
  <img alt="Concepts" src="https://img.shields.io/badge/concepts-OOP%20%7C%20collections%20%7C%20input-16746F">
</p>

## Overview

This project is a terminal-based task manager built while learning Java fundamentals. It separates the command loop, task model, and task collection into focused classes, demonstrating encapsulation, constructor overloading, collection traversal, and mutable object state.

## Capabilities

- Create a task with a name and numerical priority
- Display all tasks and their current status
- Mark a matching task as complete
- Delete tasks by exact name
- Continue accepting commands until the user exits

## Design

| Class | Responsibility |
|---|---|
| `MyProgram` | Reads commands and coordinates the console interaction |
| `Task` | Stores a task's name, priority, and completion state |
| `TaskCreator` | Owns the task collection and implements add, view, complete, and remove operations |

## Run the program

Requirements: a Java Development Kit (JDK).

```powershell
git clone https://github.com/VivaanRajpurohit/Task-Manager.git
cd Task-Manager
javac MyProgram.java Task.java TaskCreator.java
java MyProgram
```

At the prompt, enter one of the supported commands exactly:

```text
add task
delete task
complete task
view tasks
quit program
```

## Learning focus

The project emphasizes core programming ideas rather than production features:

- modeling a real concept as an object
- keeping responsibilities in separate classes
- working with `ArrayList`
- iterating over and mutating a collection
- handling console input with `Scanner`
- representing state through methods such as `markAsComp()`

## Scope

Tasks are held in memory for the current session and commands require exact text matches. Persistence, graphical interfaces, validation, automated tests, and flexible command parsing are natural future extensions.
