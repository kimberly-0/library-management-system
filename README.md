# Library management system

This project is an interactive library management system with a command line interface. The program enables the importing of books and users from a file, and enables the system user to issue and return books. [^1].

It was created as part of the *Software Development Techniques and Tools* module of the MSc Computer Science course at Newcastle University in December 2020 but has been revised and updated in September 2022.

## Preview

Click [here](https://youtu.be/ekNoFb5rE1o) for a video preview of the program on YouTube

## Tools and technologies used

- Programming language: **Java 17**
- Build tool: **Maven**
- Unit testing framework: **JUnit 4.11**

## Java library packages and classes used

- `SortedArrayList<E>` -> to create sorted lists of books and users
- `Comparable<E> interface` -> to manage the ordering of books and users
- `PrintWriter` -> to send out a book return request by writing the request to a file
- `File` -> to retrieve the text file containing books and users to import
- `Scanner` -> for recording user input via the command line interface and reading a text file

The code has been commented to further explain the purpose of the classes and methods.

## Getting started

1. Install [Java](https://www.oracle.com/java/technologies/downloads/#java17) and [Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)

2. Download the code in a ZIP file or clone the repository

``` $ git clone https://github.com/kidijkmans/library-management-system.git ```

3. Open `IO.java` (located in *src/main/java/kd*) in an IDE

4. Scroll all the way down and run the `main` method

[^1]: Disclaimer: All user data is fictional, no personal information is used in the program.
