# Library Management System

A Java-based library management application demonstrating object-oriented programming principles, developed for CSP3341 Programming Languages and Paradigms.

##  Project Overview

This project implements a library management system that demonstrates key Java programming concepts including:
- Object-Oriented Programming (OOP)
- Inheritance and Polymorphism
- Encapsulation
- Collections Framework
- Exception Handling

##  Features

- **Book Management**: Add, update, delete, and search books
- **Member Management**: Support for different member types (Student, Faculty, Public)
- **Transaction Processing**: Issue and return books with validation
- **Search & Filter**: Search books by title, author, ISBN, or genre
- **Borrowing Limits**: Different limits based on member type

##  Architecture

The system follows a three-tier architecture:

```
┌─────────────────────────────────┐
│    Presentation Layer           │
│    (Console Interface)          │
└───────────┬─────────────────────┘
            │
┌───────────▼─────────────────────┐
│    Business Logic Layer         │
│    (Services & Models)          │
└───────────┬─────────────────────┘
            │
┌───────────▼─────────────────────┐
│    Data Layer                   │
│    (In-memory storage)          │
└─────────────────────────────────┘
```

##  Project Structure

```
csp3341-java-library-system/
├── .github/
│   └── workflows/
│       └── maven.yml           # CI/CD pipeline
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/library/
│   │   │       ├── model/
│   │   │       │   ├── Book.java
│   │   │       │   ├── Member.java
│   │   │       │   ├── StudentMember.java
│   │   │       │   ├── FacultyMember.java
│   │   │       │   └── PublicMember.java
│   │   │       └── LibraryDemo.java
│   │   └── resources/
│   └── test/
│       └── java/
├── docs/
│   └── design/
│       └── class-diagram.md
├── pom.xml                     # Maven configuration
├── .gitignore
└── README.md
```

##  Technology Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| Language | Java | 21 LTS |
| Build Tool | Maven | 3.9.x |
| Testing | JUnit | 5.10.x |
| VCS | Git/GitHub | - |

##  Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or higher
- Maven 3.9.x or higher
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/csp3341-java-library-system.git
   cd csp3341-java-library-system
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the application**
   ```bash
   mvn exec:java -Dexec.mainClass="com.library.LibraryDemo"
   ```

   Or compile and run directly:
   ```bash
   javac -d target/classes src/main/java/com/library/model/*.java src/main/java/com/library/*.java
   java -cp target/classes com.library.LibraryDemo
   ```

### Running Tests

```bash
mvn test
```

##  Usage Example

```java
// Create books
Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch", "Programming");

// Create members
StudentMember student = new StudentMember("S001", "Alice Johnson");
FacultyMember faculty = new FacultyMember("F001", "Dr. Bob Smith");

// Borrow books
student.borrowBook(book1);

// Display borrowed books
student.displayBorrowedBooks();
```

##  Class Hierarchy

```
Member (Abstract)
├── StudentMember (Max: 3 books, Period: 14 days)
├── FacultyMember (Max: 5 books, Period: 28 days)
└── PublicMember (Max: 2 books, Period: 7 days)
```

## 🧪 Member Types & Limits

| Member Type | Max Books | Loan Period |
|------------|-----------|-------------|
| Student | 3 | 14 days |
| Faculty | 5 | 28 days |
| Public | 2 | 7 days |

## Development Roadmap

- [x] Basic class structure
- [x] Inheritance implementation
- [x] Borrowing/returning logic
- [ ] File-based persistence (JSON)
- [ ] Search and filter functionality
- [ ] Late fee calculation
- [ ] GUI implementation (JavaFX)

## 🤝 Contributing

This is an academic project for CSP3341. Contributions are not currently accepted.

##  License

This project is created for educational purposes as part of CSP3341 coursework at Edith Cowan University.

##  Author

**[Yuwani Samaranayake]**
- Student ID: 10639090
- Unit: CSP3341 Programming Languages and Paradigms
- Institution: Edith Cowan University
- Date: December 2024

##  Acknowledgments

- James Gosling and the Java development team
- Joshua Bloch - Effective Java
- Course instructors at Edith Cowan University

##  Contact

For questions or feedback, please contact: yuwaninomalka21@gmail.com]

---

**Note**: This project demonstrates Java programming concepts for academic purposes.
