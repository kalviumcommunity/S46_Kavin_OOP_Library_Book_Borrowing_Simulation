# Library Book Borrowing System Simulation

## Overview

The Library Book Borrowing System Simulation is a console-based Java application designed to model the key operations of a library. The system allows users to search for books, borrow and return them, manage due dates, and track book availability. This project demonstrates the application of Object-Oriented Programming (OOP) principles, including encapsulation, inheritance, and polymorphism.

## Features

- **Search for Books**: Users can search for books by title, author, or genre.
- **Borrow Books**: Users can borrow available books and receive a due date for their return.
- **Return Books**: Users can return borrowed books, updating their availability in the system.
- **Due Date Management**: The system tracks due dates for borrowed books and notifies users if books are overdue.
- **Book Availability**: The system manages the availability of books, ensuring that borrowed books are not available for others until returned.

## OOP Concepts Demonstrated

- **Encapsulation**: The system's classes encapsulate data and methods, providing a clear and organized structure.
- **Inheritance**: The project uses inheritance to create a hierarchy of classes, such as `Book`, `User`, and `Librarian`, where common attributes and behaviors are shared among related classes.
- **Polymorphism**: The system employs polymorphism to allow different types of users (e.g., students, staff) to interact with the system in various ways.

## Project Structure

- **Book**: A class representing a book in the library, including attributes like title, author, genre, and availability status.
- **User**: A class representing a user of the library, including attributes like name, ID, and borrowed books. This class may have subclasses, such as `Student` and `Staff`, to represent different types of users.
- **Librarian**: A subclass of `User`, with additional responsibilities like managing book inventory and processing book returns.
- **Library**: A class that manages the overall system, including book inventory, user records, and borrowing/returning operations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/kalviumcommunity/S46_Kavin_OOP_Library-Management-Simulation.git
2. Navigate to the project directory:
   ```bash
   cd library-book-borrowing-system
3. Compile the Java files:
   ```bash
   javac src/*.java
4. Run the main class:
   ```bash
   java src.LibrarySystem
