# Toy Language Interpreter

A simple interpreter for a custom toy programming language, built in Java.

## Features
- **Lexical Analysis**: Tokenizes input code.
- **Parsing**: Analyzes syntax and builds an internal representation.
- **Expression Evaluation**: Executes statements and expressions.
- **Modular Design**: Built using MVC architecture and Repository pattern for clean code separation.

## Architecture
- **Model**: Handles parsing, interpretation, and interacts with the Repository for data management.
- **View**: Displays output and error messages.
- **Controller**: Manages user input, coordinates actions, and updates the View.
- **Repository**: Manages language data storage and retrieval.
