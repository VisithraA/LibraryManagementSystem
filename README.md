#Library Management System

## Overview
    The Library Management System is a Java-based Console application that provides functionality for managing books, members, and user authentication for a library.

## Features
    - Admin and user login functionality.
    - Admin can manage books, search members, and view issued book details.
    - Users can sign up, log in, issue book, return book and search for books.

## Technologies Used
    - Java
    - Maven Project
    - Hibernate
    - MySQL 
    - MVVM Pattern

### Prerequisites
    - Java Development Kit (JDK)
    - MySQL Database 

## Usage
    1. Run the `MainView` class to start the application.
    2. Choose between admin and user roles.
    3. Follow the prompts to perform various actions.

 ## Project Structure

                                                                  +----------------------------+
                                                                  | LIBRARY MANAGEMENT SYSTEM  |
                                                                  +----------------------------+
                                                                          |
                                                                          V
                                         --------------------------------------------------------------------------------------  
                                         |                                                                                    |
                                +-----------------+                                                                   +-----------------+
                                |   Admin Login   |                                                                   | Sign Up / Login |
                                +-----------------+                                                                   +-----------------+
                                        |                                                                                     |
            --------------------------------------------------------------                                      ---------------------------------------------------
            |                               |                            |                                      |                                                 |
     +-----------------+            +-----------------+         +-------------------+                   +-----------------+                         +---------------------------+
     | Manage Options  |            | Search Members  |         | View Issued Books |                   |   Search Books  |                         |     Issue/Return  Book    |
     +-----------------+            +-----------------+         +-------------------+                   +-----------------+                         +---------------------------+
              |
     +-----------------+
     | Manage Books    |
     +-----------------+
              |
      +--------------------------+
      |     Add/Update/Delete    |
      +--------------------------+
         

