# CashCard Application

A Spring Boot REST API application for managing cash cards.

## Prerequisites

- Java 17 or higher
- Gradle (included via gradlew wrapper)

## Getting Started

### Building the Application

```bash
./cashcard build
```

Or use Gradle directly:

```bash
./gradlew build
```

### Running the Application

The easiest way to run the application is using the `cashcard` script:

```bash
./cashcard
```

Or explicitly:

```bash
./cashcard run
```

Or use Gradle directly:

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080` by default.

### Running Tests

```bash
./cashcard test
```

Or use Gradle directly:

```bash
./gradlew test
```

### Cleaning Build Artifacts

```bash
./cashcard clean
```

## Using the cashcard Command

The `cashcard` script provides convenient commands for common operations:

- `./cashcard` or `./cashcard run` - Start the Spring Boot application
- `./cashcard build` - Build the application
- `./cashcard test` - Run all tests
- `./cashcard clean` - Clean build artifacts
- `./cashcard help` - Show help information

## Project Structure

```
cashcard/
├── src/
│   ├── main/
│   │   └── java/com/rke/cashcard/
│   │       ├── CashcardApplication.java
│   │       └── model/
│   │           └── CashCard.java
│   └── test/
│       └── java/com/rke/cashcard/
│           ├── CashcardApplicationTests.java
│           └── CashCardJsonTest.java
├── build.gradle
├── gradlew
└── cashcard (runner script)
```

## API Endpoints

The application provides RESTful endpoints for managing cash cards. Once running, you can access the API at `http://localhost:8080`.

## Development

This is a Spring Boot application built with:
- Spring Boot 3.5.0
- Java 17
- Gradle 8.14.2

## Troubleshooting

### "bash: cashcard: command not found"

If you see this error, make sure you're running the script from the project directory:

```bash
cd /path/to/cashcard
./cashcard
```

Or add the project directory to your PATH to run it from anywhere.

### Permission Denied

If you get a permission denied error, make the script executable:

```bash
chmod +x cashcard
chmod +x gradlew
```
